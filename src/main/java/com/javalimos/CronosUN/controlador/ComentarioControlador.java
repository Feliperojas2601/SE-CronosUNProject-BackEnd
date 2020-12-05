package com.javalimos.CronosUN.controlador;

import com.javalimos.CronosUN.constante.RutasApi;
import com.javalimos.CronosUN.dto.ComentarioDTO;
import com.javalimos.CronosUN.servicio.ComentarioServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin( origins = "http://localhost:3000" )
@RestController
public class ComentarioControlador {
    
    private ComentarioServicio comentarioServicio;
    
    public ComentarioControlador( ComentarioServicio comentarioServicio ) {
        this.comentarioServicio = comentarioServicio;
    }
    
    @GetMapping( RutasApi.COMENTARIOS_PROYECTO )
    public ResponseEntity<List<ComentarioDTO>> obtenerComentariosProyecto( @RequestParam Integer idProyecto ) {
        List<ComentarioDTO> comentariosProyecto = comentarioServicio.obtenerComentariosProyecto( idProyecto );
        return ResponseEntity.ok( comentariosProyecto );
    }
    
    @PostMapping( RutasApi.REGISTRO_COMENTARIO )
    public ResponseEntity<ComentarioDTO> registrarComentario( @Valid @RequestBody ComentarioDTO nuevoComentarioDTO ) {
        ComentarioDTO comentarioRegistrado = comentarioServicio.registrarComentario( nuevoComentarioDTO );
        return ResponseEntity.ok( comentarioRegistrado );
    }
    
    @DeleteMapping( RutasApi.COMENTARIO )
    public ResponseEntity<?> eliminarComentario( @PathVariable("id") Integer idComentario ) {
        if ( comentarioServicio.eliminarComentario( idComentario ) ) {
            return new ResponseEntity<>( HttpStatus.OK );
        }
        return new ResponseEntity<>( HttpStatus.NOT_ACCEPTABLE );
    }
}
