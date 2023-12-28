package com.entrdasmicro1.entradasmicro1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entrdasmicro1.entradasmicro1.entity.Item;

@Service
public interface ItemService {

    public List<Item>finAll();

    public Item findById(Long id);
    
}
