package org.example.producto.domain.dtos;

import org.example.producto.domain.model.enums.EstadoProducto;
import org.example.producto.domain.model.enums.TipoProducto;

public record CreateProductDTO(
        long id,
        String nombre,
        EstadoProducto estado,
        String descripcion,
        int cantidad,
        double precioProvedor,
        double precioVenta,
        String imagen,
        TipoProducto tipo
){}
