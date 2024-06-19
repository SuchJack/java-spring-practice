package com.itheima.springbootquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//启动类
@SpringBootApplication
@ComponentScan(basePackages = "com")
public class SpringbootQuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootQuickstartApplication.class, args);
    }

}
