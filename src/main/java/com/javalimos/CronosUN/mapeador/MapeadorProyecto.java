package com.javalimos.CronosUN.mapeador;

import com.javalimos.CronosUN.dto.ProyectoDTO;
import com.javalimos.CronosUN.modelo.Proyecto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper( componentModel = "spring" )
public interface MapeadorProyecto {
    @Mappings( {
            @Mapping( source = "id", target = "id" ),
            @Mapping( source = "titulo", target = "titulo" ),
            @Mapping( source = "contenido", target = "contenido" ),
            @Mapping( source = "descripcion", target = "descripcion" ),
            @Mapping( source = "privacidad", target = "privacidad" ),
            @Mapping( source = "estado", target = "estado" ),
            @Mapping( source = "fechaCreacion", target = "fechaCreacion" ),
            @Mapping( source = "fechaFinalizacion", target = "fechaFinalizacion" ),
            
    } )
    Proyecto toProyecto( ProyectoDTO proyectoDTO );
    
    @InheritInverseConfiguration
    ProyectoDTO toProyectoDTO( Proyecto proyecto );
}
