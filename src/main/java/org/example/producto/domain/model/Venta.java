package org.example.producto.domain.model;

import lombok.Data;
import org.example.producto.domain.model.enums.EstadoVenta;
import org.example.producto.domain.model.enums.TipoPago;

import java.time.LocalDate;
import java.util.List;

@Data
public class Venta {
    private long id;
    private EstadoVenta estado;
    private String nombre;
    private LocalDate fechaCreado;
    private LocalDate fechaPagado;
    private double total;
    private TipoPago tipoPago;
    private int numCuotas;
    private int cuotasPagadas;
    private List <DetalleProducto> listaProductos;
    private Usuario usuario;
}
