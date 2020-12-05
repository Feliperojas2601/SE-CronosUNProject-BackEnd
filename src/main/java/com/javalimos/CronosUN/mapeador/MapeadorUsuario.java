package com.javalimos.CronosUN.mapeador;

import com.javalimos.CronosUN.dto.RegistroUsuarioDTO;
import com.javalimos.CronosUN.modelo.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
//@Mapper
public interface MapeadorUsuario {

    @Mappings({
        @Mapping(source = "nombre", target = "nombre"),
        @Mapping(source = "correo", target = "correo"),
        @Mapping(source = "clave", target = "clave"),
        @Mapping(source = "alias", target = "alias"),
        @Mapping(source = "biografia", target = "biografia")
    })
    Usuario toUsuario( RegistroUsuarioDTO usuarioDTO );

    @InheritInverseConfiguration
    RegistroUsuarioDTO toUsuarioDTO( Usuario usuario );
}
