package com.itcodershub.usermoduleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/user")
    public String userTest(){
        return "UserApi working";
    }
}