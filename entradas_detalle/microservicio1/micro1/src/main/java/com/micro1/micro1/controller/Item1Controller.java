package com.micro1.micro1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.micro1.micro1.entity.Item1;
import com.micro1.micro1.service.Item1Service;

@RestController
public class Item1Controller {
    @Autowired
    Item1Service item1Service;

    @GetMapping("/1lista")
    public List<Item1>findAll(){
        return item1Service.finAll();
    }

    @GetMapping("/1lista/{id}")
    public Item1 findById(@PathVariable Long id){
        return item1Service.findById(id);
    }
    
    
}
