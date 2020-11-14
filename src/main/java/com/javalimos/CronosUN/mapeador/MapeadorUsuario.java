package com.javalimos.CronosUN.mapeador;

import com.javalimos.CronosUN.dto.UsuarioDTO;
import com.javalimos.CronosUN.modelo.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MapeadorUsuario {
    
    @Mapping( source = "nombre", target = "nombre" )
    @Mapping( source = "correo", target = "correo" )
    @Mapping( source = "clave", target = "clave" )
    @Mapping( source = "alias", target = "alias" )
    Usuario toUsuario( UsuarioDTO usuarioDTO );
    
    @InheritInverseConfiguration
    UsuarioDTO toUsuarioDTO( Usuario usuario );
}
