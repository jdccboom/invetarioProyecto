package org.example.producto.infrastructure.adapters.output.repositories;

import org.example.producto.infrastructure.adapters.output.entities.UsuarioEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends R2dbcRepository<UsuarioEntity, Long> {
}
