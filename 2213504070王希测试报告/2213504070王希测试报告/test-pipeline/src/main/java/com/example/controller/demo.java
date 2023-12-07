package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
    @GetMapping("hello")
    public String demo(){
        return  "吕卡努";
    }
}
