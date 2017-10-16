package com.xingguang;

import com.xingguang.http.HttpClientHelper;
import com.xingguang.http.HttpClientResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    @Autowired
    private HttpClientHelper httpClientHelper;

    @Test
    public void testSendSms() throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("userid","");
        map.put("account","jksc984");
        map.put("password","agd7899");
        map.put("mobile","13611201362");
        map.put("content","您的验证码为：1234。【星光钱包】");
        map.put("sendTime","");
        map.put("action","send");
        map.put("extno","");
        HttpClientResponse res = httpClientHelper.doPost("http://sh2.ipyy.com/smsJson.aspx",map);
        System.out.println(res.getCode());
        System.out.println(res.getBody());
    }

}
