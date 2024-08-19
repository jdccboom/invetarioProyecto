package org.example.producto.infrastructure.adapters.output.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.producto.domain.model.enums.EstadoVenta;
import org.example.producto.domain.model.enums.TipoPago;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("venta")
public class VentaEntity {
    @Id @Column("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column("estado")
    private EstadoVenta estado;
    @Column ("nombre")
    private String nombre;
    @Column ("fechaCreado")
    private LocalDate fechaCreado;
    @Column ("fechaPagado")
    private LocalDate fechaPagado;
    @Column ("total")
    private double total;
    @Column ("tipopago")
    private TipoPago tipoPago;
    @Column ("numcoutas")
    private int numCuotas;
    @Column ("cuotaspagadas")
    private int cuotasPagadas;
    @OneToMany(mappedBy = "idusuario")
    private UsuarioEntity idUsuario;
}
