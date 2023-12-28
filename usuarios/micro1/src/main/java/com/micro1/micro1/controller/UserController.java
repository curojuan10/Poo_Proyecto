package com.micro1.micro1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.micro1.micro1.entity.User;
import com.micro1.micro1.service.UserService;

@RestController
public class UserController {
    @Autowired
    UserService userService;
     @GetMapping("/5lista")
    public List<User>findAll(){
        return userService.finAll();
    }

    @GetMapping("/5lista/{id}")
    public User findById(@PathVariable Long id){
        return userService.findById(id);
    }
    
    
}
