package com.xingguang.work.auth.controller;

import com.xingguang.http.HttpClientHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/10  10:03
 * @Version v1.0.0
 */
@RestController
public class TestController {

    @Autowired
    private HttpClientHelper httpClientHelper;

    @RequestMapping("httpclient")
    public void test() throws Exception {
        String str = httpClientHelper.doGet("http://www.baidu.com");
        System.out.println(str);
    }


}
