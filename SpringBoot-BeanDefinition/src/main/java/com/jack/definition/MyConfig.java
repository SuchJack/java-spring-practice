package com.jack.definition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean//Bean对应的信息会封装到ConfigurationClassBeanDefinition
    public String aa(){
        return "我是@Configuration注解的...MyConfig类的...aa方法...";
    }
}
