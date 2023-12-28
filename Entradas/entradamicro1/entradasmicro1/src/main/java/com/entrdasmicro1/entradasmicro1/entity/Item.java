package com.entrdasmicro1.entradasmicro1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private Entradas entradas;
    
    public String getProveedores(){
        if (entradas.getProveedor().equals("provedor_1")) {
            return "EMPRESA FERROMAX SAC";
        }
        if (entradas.getProveedor().equals("proveedor_2")) {
            return "EMPRESA COLOREX SAC ";
        }  
        if (entradas.getProveedor().equals("proveedor_3")) {
            return "EMPRESA DE PLASTICOS SAC";
        }
        if (entradas.getProveedor().equals("proveedor_4")) {
            return "EMPRESA FATIY SAC";
        
        } else {
            return null;
            
        }
    }
}
