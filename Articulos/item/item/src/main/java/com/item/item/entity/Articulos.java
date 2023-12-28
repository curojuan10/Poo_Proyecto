package com.item.item.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Articulos {
    private Long id;
    private String articulo;
    private LocalDate fecha_registro;
    private String localizacion;
    private String grupo;
    private String unidad_medida;
    private String existencia;
    private int cant_min;
    private double costo_promedio;
}
