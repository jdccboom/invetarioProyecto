package org.example.producto.domain.model;

import lombok.Data;
import org.example.producto.domain.model.enums.EstadoUsuario;

@Data
public class User {
    private long id;
    private EstadoUsuario state;
    private String name;
    private String lastname;
    private String email;
    private String cedula;
    private String phone;
    private String address;
    private Role role;
}
