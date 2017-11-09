package com.xingguang.utils.cell;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/9  12:46
 * @Version v1.0.0
 */
@Service
public class CellUtils {

    private final Logger logger = LogManager.getLogger(CellUtils.class);

    @Autowired
    RestTemplate restTemplate;

    @Value("${ACCESS_REPORT_TOKEN_URL}")
    private String accessUrl;
    @Value("${ACCESS_REPORT_DATE_URL}")
    private String dataUrl;
    @Value("${CLIENT_SECRET}")
    private String clientSecret;
    @Value("${ORG_NAME}")
    private String orgName;
    @Value("${HOURS}")
    private String hours;

    public String getAccessToken(){
        String accessToken = null;
        Map<String,Object> userMap = new HashMap<>();
        userMap.put("clientSecret",clientSecret);
        userMap.put("orgName",orgName);
        userMap.put("hours",hours);
        String result = restTemplate.getForObject(accessUrl, String.class, userMap);
        logger.info("获得聚信立安全凭证码，返回结果："+result);
        Map<String,Object> map = JSONObject.parseObject(result , Map.class);
        Integer code = (Integer)map.get("code");
        if(code==200){
            accessToken = (String)map.get("access_token");
        }
        return accessToken;
    }

    public String getReportData(String accessToken, String name, String idCard, String phone){
        String result = null;
        Map<String,Object> userMap = new HashMap<>();
        userMap.put("clientSecret",clientSecret);
        userMap.put("accessToken",accessToken);
        userMap.put("name",name);
        userMap.put("idCard",idCard);
        userMap.put("phone",phone);
        String jsonStr = restTemplate.getForObject(dataUrl, String.class, userMap);
        logger.info("获取用户报告数据，返回结果："+jsonStr);
        JSONObject object = JSON.parseObject(jsonStr);
        if(object.getString("success").equals("false")){
            return result;
        }
        result = jsonStr;
        return result;
    }

}
