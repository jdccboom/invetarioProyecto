package org.example.producto.infrastructure.adapters.output.portImpl;

import org.example.producto.application.port.output.ProveedorPort;
import org.example.producto.domain.model.Proveedor;
import org.example.producto.infrastructure.adapters.output.entities.ProveedorEntity;

public class ProveedorPortImpl implements ProveedorPort {
    public Proveedor toProveedorModel(ProveedorEntity proveedor) {return null;}
    public ProveedorEntity toProveedorEntity(Proveedor proveedor) {return null;}
}
