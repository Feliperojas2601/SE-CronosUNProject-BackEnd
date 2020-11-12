package com.javalimos.CronosUN.servicio.implementacion;

import com.javalimos.CronosUN.dto.UsuarioDTO;
import com.javalimos.CronosUN.mapeador.MapeadorUsuario;
import com.javalimos.CronosUN.modelo.Usuario;
import com.javalimos.CronosUN.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RegistroUsuarioServicio {
    
    @Autowired
    private MapeadorUsuario mapeador;
    
    private UsuarioRepository repositorio;
    
    public UsuarioDTO realizarRegistroUsuario( UsuarioDTO usuarioDTO ) {
        Usuario nuevoUsuario = mapeador.toUsuario( usuarioDTO );
        Usuario usuarioRegistrado = repositorio.save( nuevoUsuario );
        usuarioDTO = mapeador.toUsuarioDTO( usuarioRegistrado );
        return usuarioDTO;
    }
}
