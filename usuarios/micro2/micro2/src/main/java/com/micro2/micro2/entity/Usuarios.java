package com.micro2.micro2.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Usuarios {
    private String user_password;
    private String nombre;
    private LocalDate fecha_nacimiento;
    private String activos;
    private String administrar;
    private String resportes;
    
}
