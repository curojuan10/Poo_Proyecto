package com.micro1.micro1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Item1 {
    Salidas_detalle detalle;
    private double precio;

    public Double getMontoSalida(){
        return detalle.getCantidad()*precio;
    }
    
}
