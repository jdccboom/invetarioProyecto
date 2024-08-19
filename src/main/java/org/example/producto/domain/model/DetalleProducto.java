package org.example.producto.domain.model;

import lombok.Data;
import org.example.producto.infrastructure.adapters.output.entities.VentaEntity;

@Data
public class DetalleProducto {
    private long id;
    private int cantidad;
    private Producto producto;
    private double precioTotal;
    private VentaEntity ventaEntity;
}
