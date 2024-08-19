package org.example.producto.domain.model;

import lombok.Data;
import org.example.producto.domain.model.enums.EstadoProducto;
import org.example.producto.domain.model.enums.TipoProducto;

@Data
public class Producto {
    private long id;
    private EstadoProducto estado;
    private String nombre;
    private int cantidad;
    private String descripcion;
    private double precioProvedor;
    private double precioVenta;
    private String imagen;
    private TipoProducto tipo;
    private Proveedor proveedor;
}

