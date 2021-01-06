package com.mg.connect2caffine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Connect2CaffeineApplication {

    public static void main(String[] args) {
        SpringApplication.run(Connect2CaffeineApplication.class, args);
    }

}
