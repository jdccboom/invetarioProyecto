package org.example.producto.domain.model;

import lombok.Data;
import org.example.producto.domain.model.enums.EstadoProveedor;

@Data
public class Proveedor {
    private long id;
    private EstadoProveedor estado;
    private String nombre;
    private String contacto;
}
