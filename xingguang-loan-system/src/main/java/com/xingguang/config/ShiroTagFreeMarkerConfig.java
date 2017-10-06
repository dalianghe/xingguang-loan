package com.xingguang.config;

import com.jagregory.shiro.freemarker.ShiroTags;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.IOException;

/**
 * Created by admin on 2017/10/5.
 */
public class ShiroTagFreeMarkerConfig extends FreeMarkerConfigurer {

    @Override
    public void afterPropertiesSet() throws IOException, TemplateException {
        super.afterPropertiesSet();
        Configuration cfg = this.getConfiguration();
        cfg.setSharedVariable("shiro", new ShiroTags());
    }

    @Bean
    public ShiroTagFreeMarkerConfig shiroTagFreeMarkerConfig(){
        ShiroTagFreeMarkerConfig config = new ShiroTagFreeMarkerConfig();
        config.setTemplateLoaderPath("/aaa");
        /*Properties properties = new Properties();
        properties.put("defaultEncoding","UTF-8");
        properties.put("classic_compatible","true");
        config.setFreemarkerSettings(properties);*/
        return config;
    }

}
