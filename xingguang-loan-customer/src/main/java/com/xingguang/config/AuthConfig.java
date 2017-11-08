package com.xingguang.config;

import com.xingguang.interceptor.AuthInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by admin on 2017/9/30.
 */
@Configuration
public class AuthConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new JwtRequestMethodArgumentResolver());
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/auth/login")
                .excludePathPatterns("/auth/register")
                .excludePathPatterns("/codes")
                .excludePathPatterns("/banks")
                .excludePathPatterns("/verify/code")
                .excludePathPatterns("/verify/code/*")
                .excludePathPatterns("/sms/send/*")
                .excludePathPatterns("/wx/**");
        super.addInterceptors(registry);
    }
}
