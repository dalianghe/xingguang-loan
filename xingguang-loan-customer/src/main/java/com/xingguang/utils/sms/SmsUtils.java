package com.xingguang.utils.sms;

import com.xingguang.utils.sms.entity.SmsDataRequest;
import com.xingguang.utils.sms.entity.SmsDataResponse;
import org.apache.commons.collections.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.Map;

@Service
public class SmsUtils {

    private final Logger logger = LogManager.getLogger(SmsUtils.class);

    @Value("${SMS.USERID}")
    private String userid;

    @Value("${SMS.ACCOUNT}")
    private String account;

    @Value("${SMS.PASSWORD}")
    private String password;

    @Value("${SMS.URL}")
    private String url;

    @Autowired
    RestTemplate restTemplate;

    public SmsDataResponse sendSms(String mobile, String content) throws Exception {
        return this.sendSms(mobile, content, "");
    }

    public SmsDataResponse sendSms(String mobile, String content, String sendTime) throws Exception {
        SmsDataRequest smsDataRequest = new SmsDataRequest(this.userid, this.account, this.password, mobile, content, sendTime);
        SmsDataResponse smsDataResponse = restTemplate.postForObject(this.url, smsDataRequest, SmsDataResponse.class);
        return smsDataResponse;
    }

}
