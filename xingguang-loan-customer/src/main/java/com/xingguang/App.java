package com.xingguang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.xingguang.customer.*.mapper")
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class,args);
    }
}
