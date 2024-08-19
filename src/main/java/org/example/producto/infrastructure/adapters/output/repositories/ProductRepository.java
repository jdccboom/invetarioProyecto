package org.example.producto.infrastructure.adapters.output.repositories;

import org.example.producto.infrastructure.adapters.output.entities.ProductEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends R2dbcRepository<ProductEntity, Long> {
}
