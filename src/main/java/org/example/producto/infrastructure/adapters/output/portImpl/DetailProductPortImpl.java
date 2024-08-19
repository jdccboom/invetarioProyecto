package org.example.producto.infrastructure.adapters.output.portImpl;

import org.example.producto.application.port.output.DetailProductPort;
import org.example.producto.domain.model.DetailProduct;
import org.example.producto.infrastructure.adapters.output.entities.DetailProductEntity;
import org.springframework.stereotype.Component;

@Component
public class DetailProductPortImpl implements DetailProductPort {
    private DetailProduct toDetailProductModel(DetailProductEntity detailProduct){
        return null;
    }
    private DetailProductEntity toDetailProductEntity(DetailProduct detailProduct){
        return null;
    }
}
