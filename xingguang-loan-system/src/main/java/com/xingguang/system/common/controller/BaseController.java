package com.xingguang.system.common.controller;

import com.alibaba.fastjson.JSON;
import com.xingguang.beans.ResultBean;
import com.xingguang.utils.WebUtilsPro;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by admin on 2017/9/27.
 */
public class BaseController {

    protected static final Logger logger = LogManager.getLogger(BaseController.class);

    /*@ExceptionHandler({ UnauthenticatedException.class, AuthenticationException.class })
    public String authenticationException(HttpServletRequest params, HttpServletResponse response) {
        if (WebUtilsPro.isAjaxRequest(params)) {
            ResultBean<?> resultBean = new ResultBean<>();
            resultBean.setBizCode(ResultBean.FALL);
            resultBean.setMsg("没有登陆或回话过期，请重新登陆！");
            writeJson(resultBean, response);
            return null;
        }else {
            return "redirect:/system/login";
        }
    }

    @ExceptionHandler({ UnauthorizedException.class, AuthorizationException.class })
    public String authorizationException(HttpServletRequest params, HttpServletResponse response) {
        if (WebUtilsPro.isAjaxRequest(params)) {
            ResultBean<?> resultBean = new ResultBean<>();
            resultBean.setMsg("没有该功能的操作权限！");
            writeJson(resultBean, response);
            return null;
        }else {
            return "redirect:/system/403";
        }
    }

    private void writeJson(ResultBean resultBean, HttpServletResponse response) {
        PrintWriter out = null;
        try {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            out = response.getWriter();
            out.write(JSON.toJSONString(resultBean));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }*/
}
