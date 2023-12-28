package com.micro1.micro1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item1 {
    private Entradas_detalle detalle;

    public Double getSubTotal(){
        return detalle.getPrecio_compra()* detalle.getCantidad();
    }
    
    public Double getDescuento(){
        return getSubTotal()-(getSubTotal()*detalle.getIgv());
    }

   /*  public String getCondicion(){
        if (de) {
            
        } else {
            
        }
    }
    */
}
