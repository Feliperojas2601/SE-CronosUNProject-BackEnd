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
            @Mapping( source = "nombre", target = "nombre" ),
            @Mapping( source = "correo", target = "correo" ),
            @Mapping( source = "clave", target = "clave" ),
            @Mapping( source = "alias", target = "alias" ),
            @Mapping( source = "biografia", target = "biografia" )
    } )
    EntradaDiario toEntradaDiario( EntradaDiarioDTO entradaDiarioDTO );
    
    @InheritInverseConfiguration
    EntradaDiarioDTO toEntradaDiarioDTO( EntradaDiario entradaDiario );
}
