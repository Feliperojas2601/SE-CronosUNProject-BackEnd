package com.javalimos.CronosUN.controlador;

import com.javalimos.CronosUN.constante.RutasApi;
import com.javalimos.CronosUN.dto.UsuarioDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.javalimos.CronosUN.servicio.implementacion.InformacionUsuarioServicio;
import javax.validation.Valid;

@RestController
@RequestMapping( RutasApi.INFORMACION_USUARIO )
public class InformacionUsuarioControlador {

    private final InformacionUsuarioServicio servicio;

    public InformacionUsuarioControlador (InformacionUsuarioServicio servicio) {
        this.servicio = servicio;
    }

    @PostMapping
    public ResponseEntity<?> obtenerInformacionUsuario(
            @Valid @RequestBody UsuarioDTO usuarioDTO ) {
        Integer idUsuario = servicio.obtenerInformacionUsuario( usuarioDTO );
        return ResponseEntity.ok(idUsuario);
    }
}
