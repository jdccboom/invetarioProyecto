package org.example.producto.application.port.input;

import org.example.producto.domain.dtos.LoginDTO;
import org.example.producto.domain.dtos.PasswordRecoveryDTO;
import org.example.producto.domain.dtos.RegisterUsuarioDTO;
import org.example.producto.domain.model.User;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> registerUsuario(RegisterUsuarioDTO registerUsuarioDTO) throws Exception;
    Mono<User> login(LoginDTO loginDTO) throws Exception;
    Mono<User> recoveryPassword(PasswordRecoveryDTO passwordRecovery) throws Exception;
}
