package org.example.producto.infrastructure.adapters.output.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.producto.domain.model.enums.EstadoVenta;
import org.example.producto.domain.model.enums.TipoPago;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class SaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private EstadoVenta state;
    private String name;
    private LocalDate dateCreated;
    private LocalDate datePaid;
    private double total;
    private TipoPago typePayment;
    private int feesPaid;
    private int listProducts;
    @ManyToOne
    private UserEntity idUser;
}
