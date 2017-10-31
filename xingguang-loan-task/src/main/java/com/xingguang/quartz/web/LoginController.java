package com.xingguang.quartz.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/31  19:15
 * @Version v1.0.0
 */
@Controller
public class LoginController {

    @RequestMapping(value={"/login"})
    public String info(){
        return "login/login";
    }

}
