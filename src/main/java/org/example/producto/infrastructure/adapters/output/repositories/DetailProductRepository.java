package org.example.producto.infrastructure.adapters.output.repositories;

import org.example.producto.infrastructure.adapters.output.entities.DetailProductEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailProductRepository extends R2dbcRepository<DetailProductEntity,Long> {
}
