package com.codestates.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application";
    }

}
