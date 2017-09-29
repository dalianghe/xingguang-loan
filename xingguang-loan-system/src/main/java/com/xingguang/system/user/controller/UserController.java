package com.xingguang.system.user.controller;

import com.xingguang.system.common.controller.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2017/9/24.
 */
@Controller
@RequestMapping("/system")
public class UserController extends BaseController{
    @RequestMapping("/users")
    @RequiresPermissions("user:list")
    public String findAllUsers(HttpServletRequest request) throws Exception{
        System.out.println("---------"+request.getSession().getMaxInactiveInterval());
        return "system/user/userlist";
    }
}
