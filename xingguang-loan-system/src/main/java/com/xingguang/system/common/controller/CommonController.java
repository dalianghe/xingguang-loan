package com.xingguang.system.common.controller;

import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2017/9/24.
 */
@Controller

@RequestMapping("/common")
public class CommonController extends BaseController{

    @RequiresUser
    @RequestMapping("/index")
    public String index(){
        return "system/common/index";
    }

    @RequiresUser
    @RequestMapping("/header")
    public String header(){
        return "system/common/header";
    }

    @RequiresUser
    @RequestMapping("/menu")
    public String menu(){
        return "system/common/menu";
    }

    @RequiresUser
    @RequestMapping("/main")
    public String main(){
        return "system/common/main";
    }

    @RequiresUser
    @RequestMapping("/footer")
    public String footer(){
        return "system/common/footer";
    }

    @RequestMapping("/404")
    public String error404(){
        return "error/404";
    }

    @RequestMapping("/500")
    public String error500(){
        return "error/500";
    }
}
