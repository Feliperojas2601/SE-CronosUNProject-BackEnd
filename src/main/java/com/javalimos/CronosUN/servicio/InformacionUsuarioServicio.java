package com.javalimos.CronosUN.servicio;

import com.javalimos.CronosUN.dto.RegistroUsuarioDTO;
import com.javalimos.CronosUN.mapeador.MapeadorUsuario;
import com.javalimos.CronosUN.modelo.Usuario;
import com.javalimos.CronosUN.repositorio.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
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

    public RegistroUsuarioDTO modificarUsuario(RegistroUsuarioDTO usuario){

        Usuario usuarioEntidad = mapeador.toUsuario(usuario);
        RegistroUsuarioDTO usuarioModificado = mapeador.toUsuarioDTO( repositorio.save(usuarioEntidad) );
        return usuarioModificado;

    }

    public boolean eliminarUsuario(Integer idUsuario){
        if(repositorio.existsById(idUsuario)){
            repositorio.deleteById(idUsuario);
            return true;
        }
        return false;
    }
}
