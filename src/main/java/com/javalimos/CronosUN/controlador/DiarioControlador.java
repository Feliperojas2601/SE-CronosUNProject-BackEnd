package com.javalimos.CronosUN.controlador;

import com.javalimos.CronosUN.constante.RutasApi;

import com.javalimos.CronosUN.dto.EntradaDiarioDTO;
import com.javalimos.CronosUN.dto.FiltroEntradasDiarioDTO;
import com.javalimos.CronosUN.servicio.IDiarioServicio;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping( RutasApi.RECURSO_DIARIO )
public class DiarioControlador {
    
    @Autowired
    private IDiarioServicio diarioServicio;
    
    @GetMapping
    public ResponseEntity<List<EntradaDiarioDTO>> obtenerEntradasDiario( @Valid @RequestParam FiltroEntradasDiarioDTO datosFiltro ) {
        List<EntradaDiarioDTO> entradasDiario = diarioServicio.obtenerEntradasDiario( datosFiltro );
        
        return ResponseEntity.ok( entradasDiario );
    }
    
    @PostMapping
    public ResponseEntity<?> registrarEntradaDiario( @Valid @RequestParam EntradaDiarioDTO nuevaEntradaDiario ) {
        diarioServicio.registrarEntradaDiario( nuevaEntradaDiario );
        
        return ( ResponseEntity<?> ) ResponseEntity.ok();
    }
    
    @DeleteMapping( RutasApi.RECURSO_DIARIO_ITEM )
    public ResponseEntity<?> eliminarEntradaDiario( @Valid @PathVariable int idEntrada ) {
        diarioServicio.eliminarEntradaDiario( idEntrada );
        
        return ( ResponseEntity<?> ) ResponseEntity.ok();
    }
}
