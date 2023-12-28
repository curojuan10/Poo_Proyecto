package com.item2.item2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Item2 {
    private Articulos articulos;

    public String getGrupos(){
        if (articulos.getGrupo().equals("construccion")) {
			return "PRODUCTOS DE CONSTRUCION";
		} 

        if (articulos.getGrupo().equals("electricidad")) {
            return "PRODUCTOS DE ELECTRICIDAD";
        }

        if (articulos.getGrupo().equals("pinturas")) {
            return "PRODUCTOS DE PINTURA";
        }
        if (articulos.getGrupo().equals("manuales")) {
            return "PRODUCTOS PERSONAL";
            
        } else {
            return null;
        }
        
    }
    public String getEquivale(){
        if (articulos.getUnidad_medida().equals("metros") || articulos.getUnidad_medida().equals("centimetros") || articulos.getUnidad_medida().equals("pulgadas")) {
			return "LONGITUD";
		} 

        if (articulos.getUnidad_medida().equals("kilos") || articulos.getUnidad_medida().equals("gramos") || articulos.getUnidad_medida().equals("libras")) {
            return "PESO";
        }

        if (articulos.getUnidad_medida().equals("litros") || articulos.getUnidad_medida().equals("mililitros") || articulos.getUnidad_medida().equals("galones")) {
            return "Volumen";
        }
        if (articulos.getUnidad_medida().equals("unidad") || articulos.getUnidad_medida().equals("paquete") || articulos.getUnidad_medida().equals("cajas")) {
            return "CANTIDAD";
            
        } else {
            return null;
        }

    }
}