package com.abhishek.todoApplicationBackend.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/okta")
public class AuthenticationController {


    @PostMapping("/authcode")
    public String handleOkta()
    {

        return "hello";
    }


}
