package com.example.demo.service.impl;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.swing.UIClientPropertyKey;

import java.io.Serializable;

@Service
public class UserServiceImpl implements UserService, Serializable {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int save(User user) {
         return userMapper.save(user);
    }
}
