package com.micro1.micro1.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.micro1.micro1.entity.Item1;
import com.micro1.micro1.entity.Salidas_detalle;
@Service
public class Item1SeviceImpl implements Item1Service {
    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Item1> finAll() {
        List<Salidas_detalle> sDetalles = Arrays
                .asList(clienteRest.getForObject("http://localhost:8001/3lista", Salidas_detalle[].class));
        return sDetalles.stream().map(c -> new Item1(c, 40)).collect(Collectors.toList());
    }

    @Override
    public Item1 findById(Long id) {
        Salidas_detalle sDetalle = clienteRest.getForObject("http://localhost:8001/3lista/{id}", Salidas_detalle.class, id);

        if (sDetalle!= null) {
            return new Item1(sDetalle, 40);
        } else {
            return null;
        }
    }
}
