package org.example.producto.domain.model;

import lombok.Builder;
import lombok.Data;
import org.example.producto.domain.model.enums.EstadoProducto;
import org.example.producto.domain.model.enums.TipoProducto;

@Data
@Builder
public class Product {
    private long id;
    private EstadoProducto state;
    private String name;
    private int number;
    private String description;
    private double pricePurveyor;
    private double priceSale;
    private String image;
    private TipoProducto type;
    private Purveyor purveyor;

}

