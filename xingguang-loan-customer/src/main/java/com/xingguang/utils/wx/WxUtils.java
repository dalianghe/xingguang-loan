package com.xingguang.utils.wx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Service
public class WxUtils {

    @Value("${WX.APP_ID}")
    private String appId;
    @Value("${WX.APP_SECRET}")
    private String appSecret;
    private String baseUrl = "https://api.weixin.qq.com/cgi-bin/token";

    @PostConstruct
    public void init(){
        this.baseUrl += "?grant_type=client_credential&appid=" + this.appId + "&secret=" + appSecret;
    }

    @Autowired
    RestTemplate restTemplate;

    public WxAccessToken getAccessToken(){
        //https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET
        return this.restTemplate.getForObject(this.baseUrl, WxAccessToken.class);
    }

}
