package com.xingguang.utils.wx;

import com.xingguang.utils.wx.entity.WxAccessToken;
import com.xingguang.utils.wx.entity.WxAuth;
import com.xingguang.utils.wx.entity.WxConfig;
import com.xingguang.utils.wx.entity.WxTicket;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.UUID;

@Service
public class WxUtils {

    protected static final Logger logger = LogManager.getLogger(WxUtils.class);

    @Value("${WX.APP_ID}")
    private String appId;
    @Value("${WX.APP_SECRET}")
    private String appSecret;
    private final String baseUrl = "https://api.weixin.qq.com/";
    private String tokenUrl;
    private final String ticketUrl = this.baseUrl + "cgi-bin/ticket/getticket";
    private String authTokenUrl;

    @PostConstruct
    public void init() {
        this.tokenUrl = this.baseUrl + "cgi-bin/token?grant_type=client_credential&appid=" + this.appId + "&secret=" + appSecret;
        this.authTokenUrl = this.baseUrl + "sns/oauth2/access_token?appid=" + this.appId + "&secret="+this.appSecret+"&code=%s&grant_type=authorization_code";
    }

    @Autowired
    RestTemplate restTemplate;

    public WxConfig getWxConfig(String requestUrl) {
        WxAccessToken wxAccessToken = this.getAccessToken();
        logger.info("wxAccessToken:===============:" + wxAccessToken);
        if (wxAccessToken == null) {

        }
        WxTicket wxTicket = this.getTicket(wxAccessToken.getAccess_token());
        logger.info("wxTicket:===============:" + wxTicket);
        String nonceStr = UUID.randomUUID().toString();
        String timestamp = Long.toString(System.currentTimeMillis() / 1000);
        // 注意这里参数名必须全部小写，且必须有序
        String sign = "jsapi_ticket=" + wxTicket.getTicket() + "&noncestr=" + nonceStr + "&timestamp=" + timestamp + "&url=" + requestUrl;
        logger.info("sign:===============:" + sign);
        String signature = null;
        try {
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(sign.getBytes("UTF-8"));
            signature = byteToHex(crypt.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        WxConfig wxConfig = new WxConfig(appId, timestamp, nonceStr, signature);
        return wxConfig;
    }

    public WxAccessToken getAccessToken() {
        //https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET
        return this.restTemplate.getForObject(this.tokenUrl, WxAccessToken.class);
    }

    public WxTicket getTicket(String accessToken) {
        //https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi
        return this.restTemplate.getForObject(this.ticketUrl + "?access_token=" + accessToken + "&type=jsapi", WxTicket.class);
    }

    private static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash) {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }

    public WxAuth getAuthToken(String code) {
        //https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code
        logger.info("getAuthToken:=============:" + String.format(this.authTokenUrl, code));
        return this.restTemplate.getForObject(String.format(this.authTokenUrl, code), WxAuth.class);
    }

}
