package com.jack;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

		//获取BeanDefinition对象
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		BeanDefinition userBdf = beanFactory.getBeanDefinition("user");
		BeanDefinition aaBdf = beanFactory.getBeanDefinition("aa");
		System.out.println(userBdf.getClass());//ScannedGenericBeanDefinition
		System.out.println(aaBdf.getClass());//ConfigurationClassBeanDefinition

	}

}
