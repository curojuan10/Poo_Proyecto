package com.item2.item2.entity;

import java.time.LocalDate;


import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Articulos {
    private String articulo;
    private LocalDate fecha_registro;
    private String localizacion;
    private String grupo;
    private String unidad_medida;
    private String existencia;
    private int cant_min;
    private double costo_promedio;
    
}
