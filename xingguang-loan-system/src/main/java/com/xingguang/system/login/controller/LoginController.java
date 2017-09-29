package com.xingguang.system.login.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.system.common.controller.BaseController;
import com.xingguang.system.login.domain.AuthUserDomain;
import com.xingguang.system.login.request.LoginBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 2017/9/24.
 */
@Controller
@RequestMapping("/system")
public class LoginController extends BaseController {

    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public String login(){
        return "system/login/login";
    }

    @ResponseBody
    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    public ResultBean login(@RequestBody LoginBean loginBean) throws Exception{
        ResultBean<?> resultBean = null;
        String loginId = loginBean.getLoginId();
        String password = loginBean.getPassword();
        UsernamePasswordToken token = new UsernamePasswordToken(loginId , password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            AuthUserDomain authUserDomain = (AuthUserDomain) subject.getPrincipal();
            resultBean = new ResultBean<>(authUserDomain);
        } catch ( UnknownAccountException uae ) {
            resultBean = new ResultBean<>();
            resultBean.setBizCode(ResultBean.FALL);
            resultBean.setMsg("无效用户");
            logger.info("url=/login---method=post---Exception=UnknownAccountException");
        } catch ( IncorrectCredentialsException ice ) {
            resultBean = new ResultBean<>();
            resultBean.setBizCode(ResultBean.FALL);
            resultBean.setMsg("无效密码");
            logger.info("url=/login---method=post---Exception=IncorrectCredentialsException");
        } catch ( LockedAccountException lae ) {
            resultBean = new ResultBean<>();
            resultBean.setBizCode(ResultBean.FALL);
            resultBean.setMsg("账户锁定");
            logger.info("url=/login---method=post---Exception=LockedAccountException");
        } catch ( AuthenticationException ae ) {
            resultBean = new ResultBean<>();
            resultBean.setBizCode(ResultBean.FALL);
            resultBean.setMsg("身份认证失败");
            logger.info("url=/login---method=post---Exception=AuthenticationException");
        }
        return resultBean;
    }

    @RequiresUser
    @ResponseBody
    @RequestMapping(value = "/logout" , method = RequestMethod.GET)
    public ResultBean logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        ResultBean<?> resultBean = new ResultBean<>();
        resultBean.setMsg("退出成功");
        return resultBean;
    }
}
