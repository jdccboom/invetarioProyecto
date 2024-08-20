package org.example.producto.domain.model;

import lombok.Data;
import org.example.producto.infrastructure.adapters.output.entities.SaleEntity;

@Data
public class DetailProduct {
    private long id;
    private int number;
    private Product product;
    private double total;
    private SaleEntity sale_entity;
}
