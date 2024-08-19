package org.example.producto.infrastructure.adapters.output.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("factura")
public class FacturaEntity {

    @Id @Column("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column ("fecha")
    private LocalDate fecha;
    @Column ("titular")
    private String titular;
    @Column ("efectivo")
    private double efectivo;
    @Column ("cambio")
    private double cambio;
    @Column ("total")
    private double total;
    @Column ("idventa")
    private long idVenta;

}
