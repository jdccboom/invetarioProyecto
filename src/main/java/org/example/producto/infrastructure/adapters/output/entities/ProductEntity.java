package org.example.producto.infrastructure.adapters.output.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.producto.domain.model.enums.EstadoProducto;
import org.example.producto.domain.model.enums.TipoProducto;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private EstadoProducto state;
    private String name;
    private String description;
    private int number;
    private double pricePurveyor;
    private double priceSale;
    private String image;
    private TipoProducto type;
    @ManyToOne()
    private PurveyorEntity idPurveyorEntity;
}

