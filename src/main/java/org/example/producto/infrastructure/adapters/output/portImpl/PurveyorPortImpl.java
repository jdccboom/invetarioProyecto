package org.example.producto.infrastructure.adapters.output.portImpl;

import org.example.producto.application.port.output.PurveyorPort;
import org.example.producto.domain.model.Purveyor;
import org.example.producto.infrastructure.adapters.output.entities.PurveyorEntity;
import org.springframework.stereotype.Component;

@Component
public class PurveyorPortImpl implements PurveyorPort {
    public Purveyor toProveedorModel(PurveyorEntity proveedor) {return null;}
    public PurveyorEntity toProveedorEntity(Purveyor purveyor) {return null;}
}
