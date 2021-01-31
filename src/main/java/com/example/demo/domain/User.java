package com.example.demo.domain;


import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
public class User {

    private int id;

    private String phone;

    private String name;
}
