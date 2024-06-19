package com.jack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		//属性不是打印出去的，通常是作为环境变量
		String applicationName = context.getEnvironment().getProperty("applicationName");
		System.out.println(applicationName);
	}

}
