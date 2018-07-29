package com.example.chapter1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @RequestMapping("/index")
    public String sayHello() {
        return "Hello,World!";
    }
}
