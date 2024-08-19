package org.example.producto.infrastructure.adapters.output.portImpl;

import org.example.producto.application.port.output.SalePort;
import org.example.producto.domain.model.Sale;
import org.example.producto.infrastructure.adapters.output.entities.SaleEntity;
import org.springframework.stereotype.Component;

@Component
public class SalePortImpl implements SalePort {
    private Sale toVentaModel (SaleEntity venta) {return null;}
    private SaleEntity toVentaEntity (Sale sale) {return null;}
}
