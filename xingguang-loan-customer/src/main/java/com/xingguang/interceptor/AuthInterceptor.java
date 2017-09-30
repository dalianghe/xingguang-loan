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
            /*resultBean = new ResultBean<>("token令牌必须以存放在head的authorization中传送");
            resultBean.setBizCode(ResultBean.FALL);
            writeToClient(httpServletResponse,resultBean);*/
            throw new CustomException("token令牌必须以存放在head的authorization中传送");
            //return true;
        }else{
            String headStr = token.substring(0, 6).toLowerCase();
            if (headStr.compareTo("bearer") != 0){
                throw new CustomException("token令牌必须以bearer 开头");
                //return true;
            }else{
                token = token.substring(7, token.length());
                if(null == JwtUtils.parseJWT(token)){
                    throw new CustomException("token令牌无效或已过期");
                    //return true;
                }else{
                    return false;
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

    private void writeToClient(HttpServletResponse response,ResultBean<?> resultBean){
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        resultBean.setBizCode(ResultBean.FALL);
        try {
            String json = JSON.toJSONString(resultBean);
            out = response.getWriter();
            out.print(json);
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (out != null) {
                out.close();
            }
        }
    }
}
