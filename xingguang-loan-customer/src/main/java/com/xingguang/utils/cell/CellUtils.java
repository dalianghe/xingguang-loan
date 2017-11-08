package com.xingguang.utils.cell;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.xingguang.utils.cell.entity.AuthResponse;
import com.xingguang.utils.cell.entity.CollectResponse;
import com.xingguang.utils.cell.entity.UserBasicInfoDomain;
import com.xingguang.utils.cell.entity.UserSmsInfoDomain;
import com.xingguang.utils.http.HttpClientHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/11/7.
 */
@Service
public class CellUtils {

    private final Logger logger = LogManager.getLogger(CellUtils.class);

    @Value("${CELL.GETTOKENURL}")
    private String getTokenUrl;

    @Value("${CELL.COLLECTURL}")
    private String collectUrl;

    @Autowired
    private HttpClientHelper httpClientHelper;

    public AuthResponse sendToAuth(UserBasicInfoDomain domain){
        JSONObject jsonParam = new JSONObject();
        Map<String,String> userMap = new HashMap<>();
        userMap.put("name" , domain.getName());
        userMap.put("id_card_num" , domain.getIdCardNum());
        userMap.put("cell_phone_num" , domain.getCellPhoneNum());
        jsonParam.put("selected_website",new ArrayList<>());
        jsonParam.put("skip_mobile", false);
        jsonParam.put("basic_info", userMap);
        String result = httpClientHelper.doPost(getTokenUrl , jsonParam);
        AuthResponse response = JSONObject.parseObject(result , new TypeReference<AuthResponse>() {});
        logger.info("聚信立授权返回：code="+response.getCode()+",msg="+response.getMessage());
        return response;
    }

    public CollectResponse sendSms(AuthResponse response , String phone , String password){
        JSONObject jsonParam = new JSONObject();
        jsonParam.put("token",response.getData().getToken());
        jsonParam.put("account", phone);
        jsonParam.put("password", password);
        jsonParam.put("website", response.getData().getDatasource().getWebsite());
        String result = httpClientHelper.doPost(collectUrl , jsonParam);
        CollectResponse collectResponse = JSONObject.parseObject(result , new TypeReference<CollectResponse>() {});
        logger.info("聚信立短信接口返回：code="+collectResponse.getSuccess());
        return collectResponse;
    }

    public CollectResponse collect(UserSmsInfoDomain domain){
        JSONObject jsonParam = new JSONObject();
        jsonParam.put("token",domain.getToken());
        jsonParam.put("account", domain.getPhone());
        jsonParam.put("password", domain.getPassword());
        jsonParam.put("website", domain.getWebsite());
        jsonParam.put("captcha", domain.getCaptcha());
        jsonParam.put("type", domain.getType());
        jsonParam.put("queryPwd", domain.getQueryPwd());
        String result = httpClientHelper.doPost(collectUrl , jsonParam);
        CollectResponse response = JSONObject.parseObject(result , new TypeReference<CollectResponse>() {});
        logger.info("聚信立运营商收集信息接口返回：code="+response.getSuccess());
        return response;
    }

}
