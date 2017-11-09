package com.xingguang;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.xingguang.**.mapper")
public class App {
    public static void main( String[] args ){
        SpringApplication.run(App.class,args);
    }
}
