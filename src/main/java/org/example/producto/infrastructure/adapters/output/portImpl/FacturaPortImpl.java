package org.example.producto.infrastructure.adapters.output.portImpl;

import org.example.producto.application.port.output.FacturaPort;
import org.example.producto.domain.model.Factura;
import org.example.producto.infrastructure.adapters.output.entities.FacturaEntity;

public class FacturaPortImpl implements FacturaPort {
    private Factura toFacturaModel(FacturaEntity factura) {return null;}
    private FacturaEntity toFacturaEntity(Factura factura) {return null;}
}
