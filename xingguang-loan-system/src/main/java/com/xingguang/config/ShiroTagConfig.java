package com.xingguang.config;

import com.jagregory.shiro.freemarker.ShiroTags;
import freemarker.template.TemplateException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.IOException;
import java.util.Properties;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/9  12:05
 * @Version v1.0.0
 */
@Configuration
public class ShiroTagConfig {

    @Bean
    public ShiroTagFreeMarkerConfig shiroTagFreeMarkerConfig(){
        ShiroTagFreeMarkerConfig config = new ShiroTagFreeMarkerConfig();
        config.setTemplateLoaderPath("classpath:/templates/");
        Properties properties = new Properties();
        properties.put("defaultEncoding","UTF-8");
        properties.put("classic_compatible","true");
        config.setFreemarkerSettings(properties);
        return config;
    }

    public class ShiroTagFreeMarkerConfig extends FreeMarkerConfigurer {
        @Override
        public void afterPropertiesSet() throws IOException, TemplateException {
            super.afterPropertiesSet();
            freemarker.template.Configuration cfg = this.getConfiguration();
            cfg.setSharedVariable("shiro", new ShiroTags());
            cfg.setNumberFormat("#");
        }
    }
}
