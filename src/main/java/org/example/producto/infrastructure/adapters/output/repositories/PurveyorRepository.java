package org.example.producto.infrastructure.adapters.output.repositories;

import org.example.producto.infrastructure.adapters.output.entities.PurveyorEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurveyorRepository extends R2dbcRepository<PurveyorEntity,Long> {
}
