package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pub/user")
public class UserController {

    @Autowired
    private User user;

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("save")
    public User save(){
        user.setName("周成龙23");
        user.setPhone("13120502212123");
        userServiceImpl.save(user);
        return user;

    }
}
