package org.example.producto.infrastructure.adapters.output.portImpl;

import org.example.producto.application.port.output.UserPort;
import org.example.producto.domain.model.User;
import org.example.producto.infrastructure.adapters.output.entities.UserEntity;
import org.example.producto.infrastructure.adapters.output.repositories.UserRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class UserPortImpl implements UserPort {

    private final UserRepository userRepository;

    public UserPortImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Mono<User> findById(Long id) {
        return null;
    }

    @Override
    public Mono<User> save(User user) {
        return null;
    }

    @Override
    public Mono<User> findByEmail(String email) {
        return null;
    }

    private User toUsuarioModel(UserEntity usuario) {
        return null;
    }

    private UserEntity toUsuarioEntity(User user) {
        return null;
    }
}
