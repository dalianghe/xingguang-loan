package com.xingguang.config;

import com.xingguang.interceptor.AuthInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by admin on 2017/9/30.
 */
@Configuration
public class AuthConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/auth/login")
                .excludePathPatterns("/auth/register");
        super.addInterceptors(registry);
    }
}
