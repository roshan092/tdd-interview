package com.roshan092.tddinterview.controller;

import com.roshan092.tddinterview.domain.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public Greeting hello() {
        return Greeting.builder()
                .name("Roshan")
                .message("Good Morning")
                .build();
    }
}
