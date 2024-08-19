package org.example.producto.application.service;

import org.example.producto.application.port.input.FacturaService;
import org.example.producto.domain.model.Factura;
import reactor.core.publisher.Flux;

public class FacturaServiceImpl implements FacturaService {
    @Override
    public Flux<Factura> getAllFacturas() throws Exception {
        return null;
    }
}
