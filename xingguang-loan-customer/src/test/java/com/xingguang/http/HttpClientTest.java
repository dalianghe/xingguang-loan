package com.xingguang.http;

import com.alibaba.fastjson.JSONObject;
import com.xingguang.utils.http.HttpClientHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/11/5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HttpClientTest {

    @Autowired
    private HttpClientHelper httpClientHelper;

    @Test
    public void doGetTest() throws Exception{
        String str = httpClientHelper.doGet("https://www.google.com");
        System.out.println(str);
    }

    @Test
    public void doPostTest() throws Exception {
        String url = "https://www.juxinli.com/orgApi/rest/v3/applications/xingguangqianbao";
        JSONObject jsonParam = new JSONObject();
        Map<String,String> userMap = new HashMap<>();
        //userMap.put("name","张红");
        //userMap.put("id_card_num","342623199206032728");
        //userMap.put("cell_phone_num","15210371071");
        userMap.put("name","何大亮");
        userMap.put("id_card_num","130130198206061255");
        userMap.put("cell_phone_num","13611201362");
        List<Map> list = new ArrayList<>();
        jsonParam.put("selected_website",list);
        jsonParam.put("skip_mobile", false);
        jsonParam.put("basic_info", userMap);
        String result = httpClientHelper.doPost(url , jsonParam);
        System.out.println(result);
    }

    @Test
    public void doPostTest1() throws Exception {
        String url = "https://www.juxinli.com/orgApi/rest/v2/messages/collect/req";
        JSONObject jsonParam = new JSONObject();
        jsonParam.put("token","faa1baa1f65b4b22a3f569e31b1987f6");
        //jsonParam.put("account", "15210371071");
        //jsonParam.put("password", "102806zh");
        jsonParam.put("account", "13611201362");
        jsonParam.put("password", "58743113");
        jsonParam.put("website", "chinamobilebj");
        //jsonParam.put("captcha", "254263");
        //jsonParam.put("queryPwd", "19920603");
       // jsonParam.put("type", "SUBMIT_QUERY_PWD");
        String result = httpClientHelper.doPost(url , jsonParam);
        System.out.println(result);
    }

}
