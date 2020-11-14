package com.javalimos.CronosUN.controlador;

import com.javalimos.CronosUN.constante.RutasApi;
import com.javalimos.CronosUN.dto.UsuarioDTO;
import com.javalimos.CronosUN.servicio.IRegistroUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping( RutasApi.CREAR_USUARIO )
public class RegistroControlador {
    
    @Autowired
    private IRegistroUsuarioServicio servicio;
    
    @PostMapping
    public ResponseEntity<?> realizarRegistroUsuario(
            @Valid @RequestBody UsuarioDTO usuarioDTO ) {
        UsuarioDTO usuarioRegistradoDTO = servicio.realizarRegistroUsuario( usuarioDTO );
        
        return ResponseEntity.ok( usuarioRegistradoDTO );
    }
}
