package com.xingguang.utils.sms;

import com.alibaba.fastjson.JSONObject;
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
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
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

    public Map<String, ?> sendSms(String mobile, String content) throws Exception {
        return this.sendSms(mobile, content, "");
    }

    public Map<String, ?> sendSms(String mobile, String content, String sendTime) throws Exception {
        MultiValueMap map = this.createEntity(mobile, content, sendTime);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap> entity = new HttpEntity<>(map, headers);
        Map m = restTemplate.postForObject(this.url, entity, Map.class);
        return m;
    }

    private MultiValueMap createEntity(String mobile, String content, String sendTime){
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("userid",this.userid);
        map.add("account",this.account);
        map.add("password",this.password);
        map.add("mobile",mobile);
        map.add("content",content);
        map.add("sendTime",sendTime);
        map.add("action","send");
        map.add("extno","");
        return map;
    }

}
