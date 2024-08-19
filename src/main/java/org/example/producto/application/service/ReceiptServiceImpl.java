package org.example.producto.application.service;

import org.example.producto.application.port.input.ReceiptService;
import org.example.producto.domain.model.Receipt;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ReceiptServiceImpl implements ReceiptService {
    @Override
    public Flux<Receipt> getAllFacturas() throws Exception {
        return null;
    }
}
