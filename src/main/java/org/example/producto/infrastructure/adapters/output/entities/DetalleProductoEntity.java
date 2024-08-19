package org.example.producto.infrastructure.adapters.output.entities;

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
    @Column ("idproducto")
    private long idProducto;
    @Column ("preciototal")
    private double precioTotal;
    @Column ("idventa")
    private long idVenta;
}
