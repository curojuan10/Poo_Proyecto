package com.micro1.micro1.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.micro1.micro1.entity.Entradas_detalle;
import com.micro1.micro1.entity.Item1;

@Service
public class Item1ServiceImpl implements Item1Service{

    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Item1> finAll() {
        List<Entradas_detalle> detalles = Arrays
         .asList(clienteRest.getForObject("http://localhost:8001/1lista", Entradas_detalle[].class));
         return detalles.stream().map(a -> new Item1(a)).collect(Collectors.toList());
    }

    @Override
    public Item1 findById(Long id) {
        Entradas_detalle detalles = clienteRest.getForObject("http://localhost:8001/1lista/{id}", Entradas_detalle.class, id);

        if (detalles!= null) {
            return new Item1(detalles);
        } else {
            return null;
        }
    }

    
}
