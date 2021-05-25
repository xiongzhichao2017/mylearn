package com.xzc.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StartAPP_service_provide2 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(StartAPP_service_provide2.class).run(args);
    }
}
