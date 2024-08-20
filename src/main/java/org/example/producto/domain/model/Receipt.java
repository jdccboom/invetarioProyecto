package org.example.producto.domain.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Receipt {
    private long id;
    private LocalDate date;
    private String chief;
    private double cash;
    private double change;
    private double total;
    private Sale sale;
}
