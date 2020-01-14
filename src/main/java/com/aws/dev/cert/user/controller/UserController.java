package com.aws.dev.cert.user.controller;

import com.aws.dev.cert.user.entity.User;
import com.aws.dev.cert.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class UserController {

    public static final String USR_PATH = "/user";

    @Autowired
    private UserService userService;

    @GetMapping("/health")
    public String greeting() {
        return "healthy";
    }

    @GetMapping(USR_PATH + "/get")
    public List<User> get() {
        return userService.get();
    }
}
