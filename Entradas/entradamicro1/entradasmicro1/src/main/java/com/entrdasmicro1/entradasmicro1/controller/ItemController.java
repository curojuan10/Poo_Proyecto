package com.entrdasmicro1.entradasmicro1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.entrdasmicro1.entradasmicro1.entity.Item;
import com.entrdasmicro1.entradasmicro1.service.ItemService;

@RestController
public class ItemController {
    @Autowired
    ItemService itemService;

      @GetMapping("/2lista")
    public List<Item>findAll(){
        return itemService.finAll();
    }

    @GetMapping("/2lista/{id}")
    public Item findById(@PathVariable Long id){
        return itemService.findById(id);
    }
    
    
}
