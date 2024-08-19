package org.example.producto.domain.model;

import lombok.Data;
import org.example.producto.domain.model.enums.EstadoUsuario;

@Data
public class Usuario {
    private long id;
    private EstadoUsuario estado;
    private String nombre;
    private String apellido;
    private String correo;
    private String cedula;
    private String telefono;
    private String direccion;
}
