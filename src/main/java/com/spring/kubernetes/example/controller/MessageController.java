package com.spring.kubernetes.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/message")
    public String message(){
        return "Deployed application to kubernetes !!";
    }

}
