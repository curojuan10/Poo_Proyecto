package com.item2.item2.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.item2.item2.entity.Articulos;
import com.item2.item2.entity.Item2;

@Service
public class Item2ServiceImpl  implements Item2Service{
    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Item2> finAll() {
        List<Articulos> articulos = Arrays
                .asList(clienteRest.getForObject("http://localhost:8001/lista", Articulos[].class));
        return articulos.stream().map(p -> new Item2(p)).collect(Collectors.toList());
    }

    @Override
    public Item2 findById(Long id) {
        Articulos articulos = clienteRest.getForObject("http://localhost:8001/lista/{id}", Articulos.class, id);

        if (articulos != null) {
            return new Item2(articulos);
        } else {
            return null;
        }
    }

   
  
}