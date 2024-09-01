package com.ahmtkzk.monolitharch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MonolithArchApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonolithArchApplication.class, args);
    }

}
