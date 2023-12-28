package com.micro2.micro2.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.micro2.micro2.entity.User2;
import com.micro2.micro2.entity.Usuarios;

@Service
public class User2ServiceImpl implements User2Service {
    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<User2> finAll() {
        List<Usuarios> usuarios = Arrays
                .asList(clienteRest.getForObject("http://localhost:8001/5lista", Usuarios[].class));
        return usuarios.stream().map(p -> new User2(p)).collect(Collectors.toList());
    }

    @Override
    public User2 findById(Long id) {
        Usuarios usuario = clienteRest.getForObject("http://localhost:8001/5lista/{id}", Usuarios.class, id);

        if (usuario != null) {
            return new User2(usuario);
        } else {
            return null;
        }
    }
    
}
