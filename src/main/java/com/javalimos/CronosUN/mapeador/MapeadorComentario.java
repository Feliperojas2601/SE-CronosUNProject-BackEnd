package com.javalimos.CronosUN.mapeador;

import com.javalimos.CronosUN.dto.ComentarioDTO;
import com.javalimos.CronosUN.modelo.Comentario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper( componentModel = "spring" )
public interface MapeadorComentario {
    @Mappings( {
            @Mapping( source = "id", target = "id" ),
            @Mapping( source = "fecha", target = "fecha" ),
            @Mapping( source = "contenido", target = "contenido" ),
            @Mapping( source = "hora", target = "hora" ),
    } )
    Comentario toComentario( ComentarioDTO comentarioDTO );
    
    @InheritInverseConfiguration
    ComentarioDTO toComentarioDTO( Comentario comentario );
}
