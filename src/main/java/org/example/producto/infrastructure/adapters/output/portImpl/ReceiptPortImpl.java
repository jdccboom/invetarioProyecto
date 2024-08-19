package org.example.producto.infrastructure.adapters.output.portImpl;

import org.example.producto.application.port.output.ReceiptPort;
import org.example.producto.domain.model.Receipt;
import org.example.producto.infrastructure.adapters.output.entities.ReceiptEntity;
import org.springframework.stereotype.Component;

@Component
public class ReceiptPortImpl implements ReceiptPort {
    private Receipt toFacturaModel(ReceiptEntity factura) {return null;}
    private ReceiptEntity toFacturaEntity(Receipt receipt) {return null;}
}
