package com.xingguang.config;

import com.alibaba.druid.util.StringUtils;
import com.xingguang.beans.JWTToken;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JwtRequestMethodArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(JWTParam.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) {
        JWTToken jwtToken = (JWTToken) webRequest.getAttribute("work_token", RequestAttributes.SCOPE_REQUEST);
        JWTParam jwtParam = parameter.getParameterAnnotation(JWTParam.class);
        String key = jwtParam.key();
        if (parameter.getParameterType() == JWTToken.class || key.equals("")) {
            return jwtToken;
        }
        if (StringUtils.isEmpty(key)) {
            throw new RuntimeException("key 不能为空");
        }
        String name = key.substring(0, 1).toUpperCase() + key.substring(1);
        Object result = null;
        try {
            Method m = jwtToken.getClass().getMethod("get" + name);
            result = m.invoke(jwtToken);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        if (jwtParam.required() && result == null) {
            throw new RuntimeException("在jwt解密信息中找不到属性:" + key + "的值");
        }
        return result;

    }
}
