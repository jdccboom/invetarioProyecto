package org.example.producto.domain.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Receipt {
    private long id;
    private LocalDate fecha;
    private String titular;
    private double efectivo;
    private double cambio;
    private double total;
    private Sale sale;
}
