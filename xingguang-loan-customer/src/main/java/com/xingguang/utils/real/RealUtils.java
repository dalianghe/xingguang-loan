package com.xingguang.utils.real;

import cn.id5.gboss.GbossClient;
import cn.id5.gboss.GbossConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

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

}
