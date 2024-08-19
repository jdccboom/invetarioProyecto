package org.example.producto.infrastructure.adapters.output.repositories;

import org.example.producto.infrastructure.adapters.output.entities.SaleEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends R2dbcRepository<SaleEntity,Long> {
}
