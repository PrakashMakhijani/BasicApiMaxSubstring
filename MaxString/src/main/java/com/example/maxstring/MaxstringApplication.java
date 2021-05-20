package com.example.maxstring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
@ComponentScan(basePackages = {"com.example.maxstring.controller"})
public class MaxstringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaxstringApplication.class, args);
    }

}
