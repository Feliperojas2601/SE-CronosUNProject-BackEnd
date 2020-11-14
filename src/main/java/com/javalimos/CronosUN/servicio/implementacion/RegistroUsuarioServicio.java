package com.javalimos.CronosUN.servicio.implementacion;

import com.javalimos.CronosUN.dto.UsuarioDTO;
import com.javalimos.CronosUN.mapeador.MapeadorUsuario;
import com.javalimos.CronosUN.modelo.Usuario;
import com.javalimos.CronosUN.repositorio.UsuarioRepository;
import com.javalimos.CronosUN.servicio.IRegistroUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroUsuarioServicio implements IRegistroUsuarioServicio {
    
    @Autowired
    private MapeadorUsuario mapeador;
    
    @Autowired
    private UsuarioRepository repositorio;
    
    public UsuarioDTO realizarRegistroUsuario( UsuarioDTO usuarioDTO ) {
        Usuario nuevoUsuario = mapeador.toUsuario( usuarioDTO );
        Usuario usuarioRegistrado = repositorio.save( nuevoUsuario );
        UsuarioDTO respuestaUsuarioDTO = mapeador.toUsuarioDTO( usuarioRegistrado );
        return respuestaUsuarioDTO;
    }
}
