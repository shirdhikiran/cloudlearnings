package com.cloudlearnings.userservice.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/user")
@RestController
public class UserController {

    @GetMapping("/hi")
    public String hiUser(){
        return "Hi from user controller";
    }

}
