package com.entrdasmicro1.entradasmicro1.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Entradas {
    private LocalDate fecha_registro;
    private LocalDate fecha_entrada;
    private String proveedor;
    private int folio_factura;
    private LocalDate fecha_factura;
}
