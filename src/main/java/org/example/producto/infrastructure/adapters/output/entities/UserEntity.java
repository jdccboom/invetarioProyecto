package org.example.producto.infrastructure.adapters.output.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.producto.domain.model.enums.EstadoUsuario;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private EstadoUsuario state;
    private String name;
    private String lastname;
    private String email;
    private String cedula;
    private String phone;
    private String address;
    @ManyToOne
    private RoleEntity role;
}
