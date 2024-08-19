package org.example.producto.application.port.output;

import org.example.producto.domain.model.User;
import reactor.core.publisher.Mono;

public interface UserPort {
    Mono<User> findById(Long id);
    Mono<User> save(User user);
    Mono<User> findByEmail(String email);
}
