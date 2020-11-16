package com.javalimos.CronosUN.servicio.implementacion;

import com.javalimos.CronosUN.dto.UsuarioDTO;
import com.javalimos.CronosUN.mapeador.MapeadorUsuario;
import com.javalimos.CronosUN.modelo.Usuario;
import com.javalimos.CronosUN.repositorio.UsuarioRepository;
import com.javalimos.CronosUN.servicio.IInformacionUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InformacionUsuarioServicio implements IInformacionUsuarioServicio{

    @Autowired
    private MapeadorUsuario mapeador;

    @Autowired
    private UsuarioRepository repositorio;

    public UsuarioDTO obtenerInformacionUsuario( UsuarioDTO usuarioDTO ) {
        Usuario Usuario = mapeador.toUsuario( usuarioDTO );
        Usuario infoRegistrado = repositorio.toString( Usuario );
        UsuarioDTO respuestaUsuarioDTO = mapeador.toUsuarioDTO( infoRegistrado );
        return respuestaUsuarioDTO;
    }

}
