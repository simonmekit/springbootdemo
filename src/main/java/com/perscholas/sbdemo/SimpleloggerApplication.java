package com.perscholas.sbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:log4j2.properties")
public class SimpleloggerApplication {


    public static void main(String[] args) {
        SpringApplication.run(SimpleloggerApplication.class, args);
    }

}
