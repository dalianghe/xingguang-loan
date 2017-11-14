package com.xingguang.interceptor;

import com.alibaba.fastjson.JSON;
import com.xingguang.beans.JWTToken;
import com.xingguang.beans.ResultBean;
import com.xingguang.exception.CustomException;
import com.xingguang.utils.JwtUtils;
import com.xingguang.utils.wx.WxController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by admin on 2017/9/30.
 */
public class AuthInterceptor implements HandlerInterceptor{

    protected static final Logger logger = LogManager.getLogger(AuthInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        logger.info("AuthInterceptor--url:=======:" + httpServletRequest.getRequestURL());
        String token = httpServletRequest.getHeader("Authorization");
        if (token == null) {
            token = httpServletRequest.getParameter("Authorization");
        }
        ResultBean<?> resultBean = null;
        if((token == null) || (token.length() <=7)){
            throw new CustomException("token令牌不能为空");
        }
        String headStr = token.substring(0, 6).toLowerCase();
        if (headStr.compareTo("bearer") != 0){
            throw new CustomException("token令牌必须以bearer 开头");
        }
        token = token.substring(7, token.length());
        if(null == JwtUtils.parseJWT(token)){
            throw new CustomException("token令牌无效或已过期");
        }
        Map<String, Object> tokenParam = JwtUtils.parseJWT(token);
        String tokenJson = (String) tokenParam.get("sub");
        httpServletRequest.setAttribute("cus_token", JSON.parseObject(tokenJson, JWTToken.class));
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

}
