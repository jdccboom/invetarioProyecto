package org.example.producto.application.port.input;

import org.example.producto.domain.dtos.LoginDTO;
import org.example.producto.domain.dtos.PasswordRecoveryDTO;
import org.example.producto.domain.dtos.RegisterUsuarioDTO;
import org.example.producto.domain.model.Usuario;
import reactor.core.publisher.Mono;

public interface UsuarioService {
    Mono<Usuario> registerUsuario(RegisterUsuarioDTO registerUsuarioDTO) throws Exception;
    Mono<Usuario> login(LoginDTO loginDTO) throws Exception;
    Mono<Usuario> recoveryPassword(PasswordRecoveryDTO passwordRecovery) throws Exception;
}
