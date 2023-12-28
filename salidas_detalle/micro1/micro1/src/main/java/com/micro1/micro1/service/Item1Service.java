package com.micro1.micro1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micro1.micro1.entity.Item1;

@Service
public interface Item1Service {

    public List<Item1>finAll();
    public Item1 findById(Long id);
    
}
