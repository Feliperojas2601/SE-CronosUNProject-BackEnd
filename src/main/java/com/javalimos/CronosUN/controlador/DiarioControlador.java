package com.javalimos.CronosUN.controlador;

import com.javalimos.CronosUN.constante.RutasApi;

import com.javalimos.CronosUN.dto.EntradaDiarioDTO;
import com.javalimos.CronosUN.dto.FiltroEntradasDiarioDTO;
import com.javalimos.CronosUN.servicio.DiarioServicio;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DiarioControlador {
    
    private DiarioServicio diarioServicio;
    
    public DiarioControlador( DiarioServicio diarioServicio ) {
        this.diarioServicio = diarioServicio;
    }
    
    @PostMapping( RutasApi.REGISTRO_DIARIO )
    public ResponseEntity<EntradaDiarioDTO> registrarEntradaDiario( @Valid @RequestBody EntradaDiarioDTO nuevaEntradaDiario ) {
        EntradaDiarioDTO entradaGuardada = diarioServicio.registrarEntradaDiario( nuevaEntradaDiario );
        return ResponseEntity.ok( entradaGuardada );
    }
    
    @PostMapping( RutasApi.ENTRADA_DIARIO )
    public ResponseEntity<List<EntradaDiarioDTO>> obtenerEntradasDiario( @Valid @RequestBody FiltroEntradasDiarioDTO datosFiltro ) {
        List<EntradaDiarioDTO> entradasDiario = diarioServicio.obtenerEntradasDiario( datosFiltro );
        
        return ResponseEntity.ok( entradasDiario );
    }
    
    @DeleteMapping( RutasApi.ENTRADA_DIARIO )
    public ResponseEntity<?> eliminarEntradaDiario( @PathVariable( "id" ) Integer idEntrada ) {
        if ( diarioServicio.eliminarEntradaDiario( idEntrada ) ) {
            return new ResponseEntity<>( HttpStatus.OK );
        }
        return new ResponseEntity<>( HttpStatus.NOT_ACCEPTABLE );
    }
}
