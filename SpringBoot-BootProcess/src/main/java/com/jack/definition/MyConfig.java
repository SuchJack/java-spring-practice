package com.jack.definition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean//ConfigurationClassBeanDefinition 描述
    public String aa(){
        return "我是MyConfig的@Bean注解的aa()方法";
    }
}
