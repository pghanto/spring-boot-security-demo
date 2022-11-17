package com.example.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping ("/")
    public String login(){
        return "Welcome Everybody...";
    }


    @GetMapping ("/user")
    public String user(){
        return "Welcome User...";
    }

    @GetMapping ("/admin")
    public String admin(){
        return "Welcome Admin...";
    }
}
