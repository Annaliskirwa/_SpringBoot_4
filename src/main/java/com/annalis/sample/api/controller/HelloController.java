package com.annalis.sample.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello from kcb fraternity";
    }
}
