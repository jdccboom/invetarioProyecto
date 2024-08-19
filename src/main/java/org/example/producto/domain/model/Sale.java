package org.example.producto.domain.model;

import lombok.Data;
import org.example.producto.domain.model.enums.EstadoVenta;
import org.example.producto.domain.model.enums.TipoPago;

import java.time.LocalDate;
import java.util.List;

@Data
public class Sale {
    private long id;
    private EstadoVenta state;
    private String name;
    private LocalDate dateCreado;
    private LocalDate datePagado;
    private double total;
    private TipoPago tipoPago;
    private int numCuotas;
    private int cuotasPagadas;
    private List <DetailProduct> listaProductos;
    private User user;
}
