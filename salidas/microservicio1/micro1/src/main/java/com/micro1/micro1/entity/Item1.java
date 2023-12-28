package com.micro1.micro1.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Item1 {
   private Salidas salidas;

   public LocalDate getFechasSalida(){
    return salidas.getFecha_salida();
   }

   public String getResponsable(){
    if (salidas.getResponsable().equals("dueño")|| salidas.getResponsable().equals("administrador")) {
        return "ENCARGADO DEL ALMACEN";
    }
    if (salidas.getResponsable().equals("empleado")) {
        return "AYUDANTE DE ALMACEN ";
    
    } else {
    return null;
    }
   }
}

