
package com.javalimos.CronosUN.servicio;

import com.javalimos.CronosUN.dto.RegistroUsuarioDTO;
import com.javalimos.CronosUN.modelo.Usuario;
import com.javalimos.CronosUN.mapeador.MapeadorUsuario;
import com.javalimos.CronosUN.repositorio.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistroServicio {
    
    @Autowired
    private final MapeadorUsuario mapeador;
    
    @Autowired
    private PasswordEncoder bcryptEncoder;
    
    private final UsuarioRepository repositorio;
    
    public Integer realizarRegistroUsuario( RegistroUsuarioDTO usuario){
        Usuario usuarioEntidad = mapeador.toUsuario(usuario);
        usuarioEntidad.setClave(bcryptEncoder.encode(usuario.getClave()));
        Usuario usuarioGuardado = repositorio.save(usuarioEntidad);
        return usuarioGuardado.getId();
    }
    
}
