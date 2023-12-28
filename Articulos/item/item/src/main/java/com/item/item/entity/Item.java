package com.item.item.entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Item {
    private Articulos articulos;
    public  String getUbicacion(){
        if (articulos.getLocalizacion().equals("Jr. Asamblea 200")) {
			return "ALAMCEN 1";
		} 

        if (articulos.getLocalizacion().equals("Av. del ejercito 1520")) {
            return "ALMACEN 2";
        }

        if (articulos.getLocalizacion().equals("Av. los Incas 576")) {
            return "ALMACEN 3";
        } else {
            return null;
        }

    }

    public String getExistencias(){
          if (articulos.getExistencia().equals("si")) {
			return "PRODUCTO DISPONIBLE";
		} 

        if (articulos.getExistencia().equals("no")) {
            return "PRODUCTO NO DISPONIBLE";
        } else {
            return null;
        }
        

    }
}


