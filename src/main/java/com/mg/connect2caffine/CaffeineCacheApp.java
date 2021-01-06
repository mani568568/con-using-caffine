package com.mg.connect2caffine;

import com.mg.connect2caffine.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CaffeineCacheApp implements CommandLineRunner {

    @Autowired
    UserService userService;

    @Override
    public void run(String... args) throws Exception {

        log.info("Starting the caffeine cache testing process");
        userService.getUser(1L);
        userService.getUser(2L);
        userService.getUser(1L);
        userService.getUser(1L);
        userService.getUser(1L);
        userService.getUser(1L);
        userService.getUser(2L);
    }
}
