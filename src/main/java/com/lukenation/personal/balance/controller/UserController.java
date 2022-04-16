package com.lukenation.personal.balance.controller;


import com.lukenation.personal.balance.DTO.request.UserRequest;
import com.lukenation.personal.balance.model.User;
import com.lukenation.personal.balance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/new")
    public User createNewUser(@RequestBody UserRequest userRequest) {
        return userService.createNewUser(userRequest);
    }
}
