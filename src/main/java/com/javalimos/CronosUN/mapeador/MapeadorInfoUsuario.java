package com.javalimos.CronosUN.mapeador;

import com.javalimos.CronosUN.dto.InformacionUsuarioDTO;
import com.javalimos.CronosUN.modelo.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")

public interface MapeadorInfoUsuario {
    @Mapping(source = "id", target = "id")

    Usuario toUsuario(InformacionUsuarioDTO usuarioDTO);

    @InheritInverseConfiguration
    InformacionUsuarioDTO toRegistroUsuarioDTO(Usuario usuario);
}
