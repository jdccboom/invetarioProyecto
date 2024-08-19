package org.example.producto.application.port.output;

import org.example.producto.domain.model.Usuario;
import reactor.core.publisher.Mono;

public interface UsuarioPort {
    Mono<Usuario> findById(Long id);
    Mono<Usuario> save(Usuario usuario);
    Mono<Usuario> findByEmail(String email);
}
