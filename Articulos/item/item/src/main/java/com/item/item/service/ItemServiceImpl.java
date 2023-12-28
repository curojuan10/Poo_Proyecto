package com.item.item.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.item.item.entity.Articulos;
import com.item.item.entity.Item;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Item> finAll() {
         List<Articulos> articulos = Arrays
         .asList(clienteRest.getForObject("http://localhost:8001/lista", Articulos[].class));
         return articulos.stream().map(a -> new Item(a)).collect(Collectors.toList());
    }

    @Override   
    public Item findById(Long id) {
        Articulos articulo = clienteRest.getForObject("http://localhost:8001/lista/{id}", Articulos.class, id);

        if (articulo!= null) {
            return new Item(articulo);
        } else {
            return null;
        }
    }
    
}
