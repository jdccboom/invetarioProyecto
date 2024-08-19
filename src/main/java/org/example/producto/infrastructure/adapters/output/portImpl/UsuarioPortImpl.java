package org.example.producto.infrastructure.adapters.output.portImpl;

import org.example.producto.application.port.output.UsuarioPort;
import org.example.producto.domain.model.Usuario;
import org.example.producto.infrastructure.adapters.output.entities.UsuarioEntity;
import org.example.producto.infrastructure.adapters.output.repositories.UsuarioRepository;
import reactor.core.publisher.Mono;

public class UsuarioPortImpl implements UsuarioPort {

    private final UsuarioRepository usuarioRepository;

    public UsuarioPortImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Mono<Usuario> findById(Long id) {
        return null;
    }

    @Override
    public Mono<Usuario> save(Usuario usuario) {
        return null;
    }

    @Override
    public Mono<Usuario> findByEmail(String email) {
        return null;
    }

    private Usuario toUsuarioModel(UsuarioEntity usuario) {
        return null;
    }

    private UsuarioEntity toUsuarioEntity(Usuario usuario) {
        return null;
    }
}
