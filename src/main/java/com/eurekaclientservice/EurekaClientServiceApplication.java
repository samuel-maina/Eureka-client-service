package com.eurekaclientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
@RequestMapping(path="/demo")
public class EurekaClientServiceApplication {
@GetMapping(path="/hello")
public String sayHello(){
return "hello";
}

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientServiceApplication.class, args);

    }
}
