package com.javalimos.CronosUN.controlador;

import com.javalimos.CronosUN.constante.RutasApi;
import com.javalimos.CronosUN.dto.RegistroUsuarioDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import com.javalimos.CronosUN.servicio.InformacionUsuarioServicio;
import javax.validation.Valid;

@RestController
@CrossOrigin (origins = "http://localhost:3000")
public class InformacionUsuarioControlador {

    private final InformacionUsuarioServicio servicio;

    public InformacionUsuarioControlador (InformacionUsuarioServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping( RutasApi.INFORMACION_USUARIO )
    public ResponseEntity<?> obtenerInformacionUsuario(
            @Valid @RequestParam Integer id ) {
        RegistroUsuarioDTO idUsuario = servicio.obtenerInformacionUsuario( id );
        return ResponseEntity.ok(idUsuario);
    }
    @PutMapping( RutasApi.MODIFICAR_USUARIO )
    public ResponseEntity<?> modificarUsuario(
            @Valid @RequestBody RegistroUsuarioDTO usuarioDTO ) {
        RegistroUsuarioDTO UsuarioModificado = servicio.modificarUsuario( usuarioDTO );
        return ResponseEntity.ok(UsuarioModificado);
    }
    @DeleteMapping( RutasApi.ELIMINAR_USUARIO )
    public ResponseEntity<?> eliminarUsuario(
            @Valid @RequestParam Integer id) {
        if ( servicio.eliminarUsuario( id) ) {
            return new ResponseEntity<>( HttpStatus.OK );
        }
        return new ResponseEntity<>( HttpStatus.NOT_ACCEPTABLE );
    }

}
