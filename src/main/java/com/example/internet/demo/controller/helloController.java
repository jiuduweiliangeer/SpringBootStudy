package com.example.internet.demo.controller;

import com.example.internet.demo.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @Autowired
     Person person;
    @RequestMapping("/hello")
    public String test(){
        return person.toString();
    }
}
