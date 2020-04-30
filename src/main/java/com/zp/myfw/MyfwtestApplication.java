package com.zp.myfw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.zp.fw.config","com.example.myfwtest"})
@ComponentScan(basePackages = {"com.zp"})
//@ZpApplication
public class MyfwtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyfwtestApplication.class, args);
    }

}
