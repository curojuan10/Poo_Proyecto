package com.micro2.micro2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.micro2.micro2.entity.User2;
import com.micro2.micro2.service.User2Service;
@RestController
public class User2Controller {
    @Autowired
    User2Service user2Service;

    @GetMapping("/5lista")
    public List<User2>findAll(){
        return user2Service.finAll();
    }

    @GetMapping("/5lista/{id}")
    public User2 findById(@PathVariable Long id){
        return user2Service.findById(id);
    }
    

}
