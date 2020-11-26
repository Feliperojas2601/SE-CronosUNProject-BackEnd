package com.javalimos.CronosUN.servicio.implementacion;

import com.javalimos.CronosUN.dto.InformacionUsuarioDTO;
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

    public RegistroUsuarioDTO obtenerInformacionUsuario( InformacionUsuarioDTO informacionUsuarioDTO ) {
        System.out.println(informacionUsuarioDTO);
        Usuario usuario = repositorio.findById(informacionUsuarioDTO.getId()).get();
        System.out.println( usuario);
        RegistroUsuarioDTO respuestaUsuario = mapeador.toUsuarioDTO( usuario );

        return respuestaUsuario;
    }

}
