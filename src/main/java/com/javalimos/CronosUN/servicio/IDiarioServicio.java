package com.javalimos.CronosUN.servicio;


import com.javalimos.CronosUN.dto.EntradaDiarioDTO;
import com.javalimos.CronosUN.dto.FiltroEntradasDiarioDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IDiarioServicio {
    
    List<EntradaDiarioDTO> obtenerEntradasDiario( FiltroEntradasDiarioDTO datosFiltro );
    
    boolean registrarEntradaDiario( EntradaDiarioDTO nuevaEntradaDiario );
    
    boolean eliminarEntradaDiario( int idEntrada );
}