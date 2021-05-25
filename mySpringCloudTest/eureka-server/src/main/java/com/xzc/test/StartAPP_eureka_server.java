package com.xzc.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class StartAPP_eureka_server {
    public static void main(String[] args) {
        new SpringApplicationBuilder(StartAPP_eureka_server.class).run(args);
    }
}
