package org.example.producto.infrastructure.adapters.output.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.producto.domain.model.enums.EstadoUsuario;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("usuario")
public class UsuarioEntity {
    @Id
    @Column("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column ("estado")
    private EstadoUsuario estado;
    @Column ("nombre")
    private String nombre;
    @Column ("apellido")
    private String apellido;
    @Column ("correo")
    private String correo;
    @Column ("cedula")
    private String cedula;
    @Column ("telefono")
    private String telefono;
    @Column ("direccion")
    private String direccion;
}
