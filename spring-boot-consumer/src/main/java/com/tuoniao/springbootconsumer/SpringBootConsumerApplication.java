package com.tuoniao.springbootconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringBootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsumerApplication.class, args);
    }

}
