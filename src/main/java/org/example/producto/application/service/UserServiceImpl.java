package org.example.producto.application.service;

import org.example.producto.application.port.input.UserService;
import org.example.producto.domain.dtos.LoginDTO;
import org.example.producto.domain.dtos.PasswordRecoveryDTO;
import org.example.producto.domain.dtos.RegisterUsuarioDTO;
import org.example.producto.domain.model.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public Mono<User> registerUsuario(RegisterUsuarioDTO registerUsuarioDTO) throws Exception {
        return null;
    }

    @Override
    public Mono<User> login(LoginDTO loginDTO) throws Exception {
        return null;
    }

    @Override
    public Mono<User> recoveryPassword(PasswordRecoveryDTO passwordRecovery) throws Exception {
        return null;
    }
}
