package com.xzc.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private Registration registration; // 服务注册

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() throws InterruptedException {
        String serviceId = registration.getServiceId();
        List<ServiceInstance> serviceInstanceList = client.getInstances(serviceId);

        for(ServiceInstance instance : serviceInstanceList) {
            logger.info("hello, host : " + instance.getHost() + ", service_id : " + instance.getServiceId());
        }
         //模拟处理时间
        Thread.sleep(100);
        return "hello world";
    }
}
