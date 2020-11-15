package com.javalimos.CronosUN.controlador;

import com.javalimos.CronosUN.constante.RutasApi;
import com.javalimos.CronosUN.dto.UsuarioDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.javalimos.CronosUN.servicio.RegistroServicio;

import javax.validation.Valid;

@RestController
@RequestMapping( RutasApi.CREAR_USUARIO )
public class RegistroControlador {
    
    private final RegistroServicio servicio;
    
    public RegistroControlador (RegistroServicio servicio) {
        this.servicio = servicio;        
    }
    
    @PostMapping
    public ResponseEntity<?> realizarRegistroUsuario(
            @Valid @RequestBody UsuarioDTO usuarioDTO ) {
        Integer idUsuario = servicio.realizarRegistroUsuario( usuarioDTO );
        return ResponseEntity.ok(idUsuario);
    }
}
