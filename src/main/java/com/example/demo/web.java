package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class web {
    @RequestMapping("/")
    public String sayHello() {
        return "Hello,热单导部十嘎嘎嘎三点是署!";
    }
}
