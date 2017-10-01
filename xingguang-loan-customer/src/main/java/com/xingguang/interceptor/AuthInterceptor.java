package com.xingguang.interceptor;

import com.alibaba.fastjson.JSON;
import com.xingguang.beans.ResultBean;
import com.xingguang.exception.CustomException;
import com.xingguang.utils.JwtUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by admin on 2017/9/30.
 */
public class AuthInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String token = httpServletRequest.getHeader("authorization");
        ResultBean<?> resultBean = null;
        if((token == null) || (token.length() <=7)){
            throw new CustomException("token令牌不能为空");
        }else{
            String headStr = token.substring(0, 6).toLowerCase();
            if (headStr.compareTo("bearer") != 0){
                throw new CustomException("token令牌必须以bearer 开头");
            }else{
                token = token.substring(7, token.length());
                if(null == JwtUtils.parseJWT(token)){
                    throw new CustomException("token令牌无效或已过期");
                }else{
                    return true;
                }
            }
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

}
