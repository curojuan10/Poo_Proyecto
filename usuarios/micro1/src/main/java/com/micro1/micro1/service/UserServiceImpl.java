package com.micro1.micro1.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.micro1.micro1.entity.User;
import com.micro1.micro1.entity.Usuarios;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<User> finAll() {
        List<Usuarios> usuarios = Arrays
                .asList(clienteRest.getForObject("http://localhost:8001/5lista", Usuarios[].class));
        return usuarios.stream().map(p -> new User(p)).collect(Collectors.toList());
    }

    @Override
    public User findById(Long id) {
        Usuarios usuario = clienteRest.getForObject("http://localhost:8001/5lista/{id}", Usuarios.class, id);

        if (usuario!= null) {
            return new User(usuario);
        } else {
            return null;
        }
    }


    
}
