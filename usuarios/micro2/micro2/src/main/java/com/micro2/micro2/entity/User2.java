package com.micro2.micro2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User2 {
   private Usuarios usuarios;

   public String getAdministrar(){
        if (usuarios.getAdministrar().equals("si")) {
            return "SI PUEDE ADMINISTRAR ";
        }
        if (usuarios.getAdministrar().equals("no")) {
             return "NO PUEDE ADMINISTRAR";
    
        } else {
        return null;
        }
   }

   public String getReportes(){
        if (usuarios.getResportes().equals("si")) {
            return "SI PUEDE HACER REPORTE ";
        }
        if (usuarios.getResportes().equals("no")) {
             return "NO PUEDE HACER REPORTE";
    
        } else {
        return null;
        }
   }
}

