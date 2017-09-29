package com.xingguang.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * Created by admin on 2017/9/25.
 */
@Configuration
public class DataSourceConfig {
    @Bean(destroyMethod = "close", initMethod = "init")
    @ConfigurationProperties("spring.datasource.druid")
    public DataSource dataSourceTwo(){
        return DruidDataSourceBuilder.create().build();
    }
}
