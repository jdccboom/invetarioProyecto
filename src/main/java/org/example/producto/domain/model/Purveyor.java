package org.example.producto.domain.model;

import lombok.Builder;
import lombok.Data;
import org.example.producto.domain.model.enums.EstadoProveedor;

@Data
@Builder
public class Purveyor {
    private long id;
    private EstadoProveedor state;
    private String name;
    private String contact;
}
