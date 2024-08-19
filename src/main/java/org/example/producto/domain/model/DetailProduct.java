package org.example.producto.domain.model;

import lombok.Data;
import org.example.producto.infrastructure.adapters.output.entities.SaleEntity;

@Data
public class DetailProduct {
    private long id;
    private int cantidad;
    private Product product;
    private double precioTotal;
    private SaleEntity saleEntity;
}
