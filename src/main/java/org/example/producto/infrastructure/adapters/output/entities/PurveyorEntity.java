package org.example.producto.infrastructure.adapters.output.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.producto.domain.model.enums.EstadoProveedor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("proveedor")
public class PurveyorEntity {
    @Id
    @Column("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column ("estado")
    private EstadoProveedor estado;
    @Column ("nombre")
    private String nombre;
    @Column ("contacto")
    private String contacto;
}
