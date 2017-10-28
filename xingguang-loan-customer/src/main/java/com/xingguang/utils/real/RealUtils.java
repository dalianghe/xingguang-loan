package com.xingguang.utils.real;

import cn.id5.gboss.GbossClient;
import cn.id5.gboss.GbossConfig;
import cn.id5.gboss.http.HttpResponseData;
import org.apache.commons.collections.CollectionUtils;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

@Service
public class RealUtils {

    private final Logger logger = LogManager.getLogger(RealUtils.class);

    @Value("${REAL.ENDPOINT}")
    private String endpoint;

    @Value("${REAL.DESKEY}")
    private String desKey;

    @Value("${REAL.ACCOUNT}")
    private String account;

    @Value("${REAL.PASSWORD}")
    private String password;

    @Value("${REAL.PRODUCT_TYPE}")
    String productType;

    private GbossClient client;

    @PostConstruct
    public void init() {
        this.logger.info("实名认证初始化=================>开始");
        synchronized (this) {
            if (client == null) {
                final GbossConfig config = new GbossConfig();
                config.setEndpoint(this.endpoint);
                config.setDesKey(this.desKey);
                config.setAccount(this.account);
                config.setAccountpwd(this.password);
                config.setEncrypted(true);
                config.setDesCharset("GB18030");
                config.setTimeout(15000);
                this.client = new GbossClient(config);
            }
        }
        this.logger.info("实名认证初始化=================>结束");
    }

    public GbossClient getClient(){
        return this.client;
    }

    public String realByNameAndIdNo(String name, String idNo) throws Exception {
        HttpResponseData httpdata = this.client.invokeSingle(this.productType, name + "," + idNo);
        logger.info("实名认证状态------------------>" + httpdata.getStatus());
        logger.info("实名认证耗时------------------>" + httpdata.getTime());
        logger.info("实名认证内容------------------>" + httpdata.getData());
        if (httpdata.getStatus() == HttpStatus.SC_OK) {
            return  this.parseRealXML(httpdata.getData());
        }
        return null;
    }

    public String parseRealXML(String xml) throws IOException, DocumentException {
//        Document document = DocumentHelper.parseText(xml);
        Document document = new SAXReader().read(new StringReader(xml));
        List list = document.selectNodes("//data/policeCheckInfos/policeCheckInfo/compStatus");
        if(CollectionUtils.isEmpty(list)){
            return null;
        }
        Element element = (Element)list.get(0);
        return element.getText();
    }

}
