package com.micro1.micro1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micro1.micro1.entity.User;

@Service
public interface UserService {
    public List<User>finAll();
    public User findById(Long id);
    
}
