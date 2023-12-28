package com.micro1.micro1.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Salidas {
     private LocalDate fecha_registro;
    private LocalDate fecha_salida;
    private String responsable;
}
