package com.micro2.micro2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micro2.micro2.entity.User2;

@Service
public interface User2Service {
    public List<User2>finAll();
    
    public User2 findById(Long id);
    
}
