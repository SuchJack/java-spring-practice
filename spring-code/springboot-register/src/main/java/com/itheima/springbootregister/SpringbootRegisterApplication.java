package com.itheima.springbootregister;

import com.itheima.anno.EnableCommonConfig;
import com.itheima.pojo.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@Import({CommonConfig.class})
//@Import(CommonImportSelector.class)
@EnableCommonConfig
public class SpringbootRegisterApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbootRegisterApplication.class, args);

//        Country country = context.getBean(Country.class);
        //System.out.println(country);

        System.out.println(context.getBean("province"));
    }

}
