package org.example.producto.application.service;

import org.example.producto.application.port.input.UsuarioService;
import org.example.producto.domain.dtos.LoginDTO;
import org.example.producto.domain.dtos.PasswordRecoveryDTO;
import org.example.producto.domain.dtos.RegisterUsuarioDTO;
import org.example.producto.domain.model.Usuario;
import reactor.core.publisher.Mono;

public class UsuarioServiceImpl implements UsuarioService {
    @Override
    public Mono<Usuario> registerUsuario(RegisterUsuarioDTO registerUsuarioDTO) throws Exception {
        return null;
    }

    @Override
    public Mono<Usuario> login(LoginDTO loginDTO) throws Exception {
        return null;
    }

    @Override
    public Mono<Usuario> recoveryPassword(PasswordRecoveryDTO passwordRecovery) throws Exception {
        return null;
    }
}
