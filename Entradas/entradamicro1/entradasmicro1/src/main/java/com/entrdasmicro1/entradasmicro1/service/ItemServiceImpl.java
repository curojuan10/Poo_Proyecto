package com.entrdasmicro1.entradasmicro1.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entrdasmicro1.entradasmicro1.entity.Entradas;
import com.entrdasmicro1.entradasmicro1.entity.Item;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Item> finAll() {
        List<Entradas> entradas = Arrays
                .asList(clienteRest.getForObject("http://localhost:8001/2lista", Entradas[].class));
        return entradas.stream().map(p -> new Item(p)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id) {
        Entradas entradas = clienteRest.getForObject("http://localhost:8001/2lista/{id}", Entradas.class, id);

        if (entradas!= null) {
            return new Item(entradas);
        } else {
            return null;
        }
    }
    
}
