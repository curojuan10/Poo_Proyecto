package com.item2.item2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.item2.item2.entity.Item2;
import com.item2.item2.service.Item2Service;

@RestController
public class Item2Controller {
    @Autowired
    Item2Service item2Service;

     @GetMapping("/lista")
    public List<Item2>findAll(){
        return item2Service.finAll();
    }

    @GetMapping("/lista/{id}")
    public Item2 findById(@PathVariable Long id){
        return item2Service.findById(id);
    }
    
}
