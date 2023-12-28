package com.micro1.micro1.entity;

import java.time.LocalDate;
import java.time.Period;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
   private Usuarios usuarios;

   public int getEdad(){
    return Period.between(usuarios.getFecha_nacimiento(),LocalDate.now()).getYears();
   }

   public String getEstado(){
    if (usuarios.getActivos().equals("si")) {
        return " EL USUARIO ESTA ACTIVO";
    }
    if (usuarios.getActivos().equals("no")) {
        return "EL USUARIO NO ESTA ACTIVO";  
    } else {
        return null;
    }

   }
}
