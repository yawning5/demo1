package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//zxc
@RestController
@RequestMapping
public class controller {

    @GetMapping("/")
    public String get(){
        return "helloWorld";
    }
}
