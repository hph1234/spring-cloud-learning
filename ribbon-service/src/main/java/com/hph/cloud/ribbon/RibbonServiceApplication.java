package com.hph.cloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class RibbonServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonServiceApplication.class, args);
    }
}
