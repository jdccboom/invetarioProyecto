package org.example.producto.domain.model;

import lombok.Builder;
import lombok.Data;
import org.example.producto.domain.model.enums.EstadoProducto;
import org.example.producto.domain.model.enums.TipoProducto;

@Data
@Builder
public class Product {
    private long id;
    private EstadoProducto state;
    private String name;
    private int cantidad;
    private String descripcion;
    private double precioProvedor;
    private double precioVenta;
    private String imagen;
    private TipoProducto tipo;
    private Proveedor proveedor;

}

