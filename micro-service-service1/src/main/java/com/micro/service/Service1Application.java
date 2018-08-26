package com.micro.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务1
 */
@SpringBootApplication
//@EnableEurekaClient
public class Service1Application {
    public static void main(String[] args) {
//        new SpringApplicationBuilder(Service1Application.class).web(WebApplicationType.SERVLET).run(args);
        SpringApplication.run(Service1Application.class, args);
    }
}
