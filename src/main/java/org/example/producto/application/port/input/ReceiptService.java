package org.example.producto.application.port.input;

import org.example.producto.domain.model.Receipt;
import reactor.core.publisher.Flux;

public interface ReceiptService {
    Flux<Receipt> getAllFacturas() throws Exception;
}
