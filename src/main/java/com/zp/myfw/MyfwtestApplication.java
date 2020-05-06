package com.zp.myfw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.zp.fw.config","com.example.myfwtest"})
//@ComponentScan(basePackages = {"com.zp"})
// beanPostConstructor中拿不到启动类中的ZpApplication注解，原因不明
//@ZpApplication
public class MyfwtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyfwtestApplication.class, args);
    }

}
