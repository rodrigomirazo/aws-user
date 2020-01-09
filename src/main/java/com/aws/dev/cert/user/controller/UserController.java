package com.aws.dev.cert.user.controller;

import com.aws.dev.cert.user.entity.User;
import com.aws.dev.cert.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/health")
    public String greeting() {
        return "healthy";
    }

    @RequestMapping("/get")
    public List<User> get() {
        return userService.get();
    }
}
