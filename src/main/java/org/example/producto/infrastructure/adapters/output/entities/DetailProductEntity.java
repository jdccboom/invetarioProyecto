package org.example.producto.infrastructure.adapters.output.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class DetailProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int number;
    @ManyToOne
    private ProductEntity idProduct;
    private double total;
    @ManyToOne
    private SaleEntity saleEntity;
}
