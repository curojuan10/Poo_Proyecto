package com.item.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.item.item.entity.Item;
import com.item.item.service.ItemService;

@RestController
public class ItemController {
    @Autowired
    ItemService itemService;
    
    @GetMapping("/lista")
    public List<Item>findAll(){
        return itemService.finAll();
    }

    @GetMapping("/lista/{id}")
    public Item findById(@PathVariable Long id){
        return itemService.findById(id);
    }
    
}
