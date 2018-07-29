package com.example.chapter1.controller;

import com.example.chapter1.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());



    @Value("${com.example.name}")
    private String name;
    @Value("${com.example.want}")
    private String want;

    @RequestMapping("/")
    public String hello(){
        return name+","+want;
    }
}
