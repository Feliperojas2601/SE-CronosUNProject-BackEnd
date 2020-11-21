package com.javalimos.CronosUN.mapeador;

import com.javalimos.CronosUN.dto.OpcionAsignaturaDTO;
import com.javalimos.CronosUN.modelo.AsignaturaOpcion;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface MapeadorOpcionAsignatura {
    @Mappings({
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "creditos", target = "creditos"),
            @Mapping(source = "grupos", target = "grupos")
    })
    AsignaturaOpcion toAsignaturaOpcion(OpcionAsignaturaDTO opcionAsignaturaDTO);
    @InheritInverseConfiguration
    OpcionAsignaturaDTO toOpcionAsignaturaDTO(AsignaturaOpcion asignaturaOpcion);
}
