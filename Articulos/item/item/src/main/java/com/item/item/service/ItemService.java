package com.item.item.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.item.item.entity.Item;

@Service
public interface ItemService {
    public List<Item>finAll();
    public Item findById(Long id);

    
}
    