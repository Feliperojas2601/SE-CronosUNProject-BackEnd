package com.javalimos.CronosUN.mapeador;

import com.javalimos.CronosUN.dto.EntradaDiarioDTO;
import com.javalimos.CronosUN.modelo.EntradaDiario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper( componentModel = "spring" )
public interface MapeadorEntradaDiario {
    
    @Mappings( {
            @Mapping( source = "id", target = "id" ),
            @Mapping( source = "fecha", target = "fecha" ),
            @Mapping( source = "contenido", target = "contenido" ),
            @Mapping( source = "hora", target = "hora" ),
    } )
    EntradaDiario toEntradaDiario( EntradaDiarioDTO entradaDiarioDTO );
    
    @InheritInverseConfiguration
    EntradaDiarioDTO toEntradaDiarioDTO( EntradaDiario entradaDiario );
}
