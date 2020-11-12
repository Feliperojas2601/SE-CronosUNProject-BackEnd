package com.javalimos.CronosUN.mapeador;

import com.javalimos.CronosUN.dto.UsuarioDTO;
import com.javalimos.CronosUN.modelo.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapeadorUsuario {
    Usuario toUsuario( UsuarioDTO usuarioDTO );
    
    @InheritInverseConfiguration
    UsuarioDTO toUsuarioDTO( Usuario usuario );
}
