package com.roshan092.tddinterview.controller;

import com.roshan092.tddinterview.domain.Greeting;
import com.roshan092.tddinterview.service.UserNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private UserNameService userNameService;

    @GetMapping("/hello")
    public Greeting hello() {
        return Greeting.builder()
                .name(userNameService.getFullNameInUpperCase("Roshan", "Lobo"))
                .message("Good Morning")
                .build();
    }
}
