package org.example.producto.application.port.input;

import org.example.producto.domain.model.Factura;
import reactor.core.publisher.Flux;

public interface FacturaService {
    Flux<Factura> getAllFacturas() throws Exception;
}
