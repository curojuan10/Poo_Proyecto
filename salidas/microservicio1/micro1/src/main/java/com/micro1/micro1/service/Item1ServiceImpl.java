package com.micro1.micro1.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.micro1.micro1.entity.Item1;
import com.micro1.micro1.entity.Salidas;

@Service
public class Item1ServiceImpl implements Item1Service {
    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Item1> finAll() {
       List<Salidas> salidas = Arrays
         .asList(clienteRest.getForObject("http://localhost:8001/4lista", Salidas[].class));
         return salidas.stream().map(a -> new Item1(a)).collect(Collectors.toList());
    }

    @Override
    public Item1 findById(Long id) {
        Salidas salidas = clienteRest.getForObject("http://localhost:8001/4lista/{id}", Salidas.class, id);

        if (salidas!= null) {
            return new Item1(salidas);
        } else {
            return null;
        }
    }
    
}
