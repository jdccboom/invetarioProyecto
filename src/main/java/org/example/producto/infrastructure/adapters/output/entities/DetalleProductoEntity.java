package org.example.producto.infrastructure.adapters.output.entities;

import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("detalleProducto")
public class DetalleProductoEntity {
    @Column ("cantidad")
    private int cantidad;
    @OneToOne(mappedBy = "idproducto")
    private ProductEntity idProducto;
    @Column ("preciototal")
    private double precioTotal;
    @OneToOne (mappedBy = "idventa")
    private VentaEntity idVenta;
}
