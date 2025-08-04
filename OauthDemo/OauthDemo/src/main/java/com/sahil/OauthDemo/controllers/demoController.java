package com.sahil.OauthDemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @GetMapping("/introauth")
    public String oauthh(){
        return "O auth is here";
    }



}
