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
    private LocalDate dateCreated;
    private LocalDate datePaid;
    private double total;
    private TipoPago typePayment;
    private int numberFees;
    private int feesPaid;
    private List <DetailProduct> listProducts;
    private User user;
}
