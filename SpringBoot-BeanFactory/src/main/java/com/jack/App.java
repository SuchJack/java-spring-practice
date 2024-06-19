package com.jack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

		System.out.println(context.getClass());//AnnotationConfigServletWebServerApplicationContext
		App appBean = context.getBean(App.class);
		System.out.println(appBean);// com.jack.App$$SpringCGLIB$$0@56f730b2 代理对象
	}

}
