package org.example.producto.domain.model;

import lombok.Data;
import org.example.producto.infrastructure.adapters.output.entities.VentaEntity;

@Data
public class DetalleProducto {
    private long id;
    private int cantidad;
    private Product product;
    private double precioTotal;
    private VentaEntity ventaEntity;
}
