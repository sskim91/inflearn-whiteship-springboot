package com.sskim.demo.controller;

import com.sskim.demo.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/helloUser")
    public String hello() {
        return "helloUser";
    }

    @PostMapping("/users/create")
    public User create(@RequestBody User user) {
        return user;
    }
}