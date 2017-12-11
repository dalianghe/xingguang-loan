package com.xingguang.grid.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xingguang.common.beans.ResultBean;
import com.xingguang.grid.service.IJxlGridReportService;
import com.xingguang.log.entity.SysInterfaceLogEntity;
import com.xingguang.log.service.ISysInterfaceLogService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/12/11.
 */
@RestController
public class GridController {

    protected static final Logger logger = LogManager.getLogger(GridController.class);

    @Value("${ACCESS_REPORT_TOKEN_URL}")
    private String accessUrl;
    @Value("${DATA_REPORT_TOKEN_URL}")
    private String dataUrl;
    @Value("${COMP_ACCOUNT}")
    private String account;
    @Value("${COMP_CLIENT_SECTET}")
    private String clientSecret;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ISysInterfaceLogService sysInterfaceLogService;

    @RequestMapping(value = "/grid" , method = RequestMethod.GET)
    public ResultBean<?> getJxlGridInfo(Long userId,String userName,String idCard,String phone,Long bizId) throws Exception{
        ResultBean<?> resultBean = null;
        JSONObject object = null;
        SysInterfaceLogEntity logEntity = sysInterfaceLogService.getLogByBizId(bizId);
        if(null == logEntity){
            Map<String, Object> tokenMap = new HashMap<>();
            tokenMap.put("account", account);
            tokenMap.put("clientSecret", clientSecret);
            String jsonStr = restTemplate.getForObject(accessUrl, String.class, tokenMap);
            logger.info("获取聚信立密码访问token："+jsonStr);
            JSONObject tokenStr = JSON.parseObject(jsonStr);
            JSONObject data = JSON.parseObject(tokenStr.getString("data"));
            String accessToken = data.getString("access_token");
            Map<String, Object> dataMap = new HashMap<>();
            dataMap.put("clientSecret", clientSecret);
            dataMap.put("token", accessToken);
            dataMap.put("name", userName);
            dataMap.put("idCard", idCard);
            dataMap.put("phone", phone);
            String dataStr = restTemplate.getForObject(dataUrl, String.class, dataMap);
            logger.info("获取聚信立返回json："+dataStr);
            sysInterfaceLogService.insertLog(userId,userName,idCard,phone,dataStr,bizId);
            object = JSON.parseObject(dataStr);
        }else{
            object = JSON.parseObject(logEntity.getReceiveData());
        }
        resultBean = new ResultBean(JSON.parseObject(object.getString("data")));

        resultBean.setBizCode(ResultBean.SUCCESS);
        return resultBean;
    }
}
