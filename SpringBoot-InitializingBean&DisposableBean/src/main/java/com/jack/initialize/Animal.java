package com.jack.initialize;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Animal implements InitializingBean, DisposableBean {

    //第二种方式：注解
    //PostConstructor,PreDestroy,提供初始化方法和销毁方法
    @PostConstruct
    public void initMethod(){
        System.out.println("Animal...@PostConstruct注解...initMethod方法");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("Animal...@PreDestroy注解...destroyMethod方法");
    }


    //销毁方法
    @Override
    public void destroy() throws Exception {
        System.out.println("Animal...destroy...");
    }

    //初始化方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Animal...afterPropertiesSet...");
    }
}
