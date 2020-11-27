package com.javalimos.CronosUN.servicio;

import com.javalimos.CronosUN.dto.RegistroUsuarioDTO;
import com.javalimos.CronosUN.mapeador.MapeadorUsuario;
import com.javalimos.CronosUN.modelo.Usuario;
import com.javalimos.CronosUN.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InformacionUsuarioServicio {

    @Autowired
    private MapeadorUsuario mapeador;

    @Autowired
    private UsuarioRepository repositorio;

    public RegistroUsuarioDTO obtenerInformacionUsuario( Integer id ) {

        Usuario usuario = repositorio.findById(id).get();
        RegistroUsuarioDTO respuestaUsuario = mapeador.toUsuarioDTO( usuario );

        return respuestaUsuario;
    }

}
