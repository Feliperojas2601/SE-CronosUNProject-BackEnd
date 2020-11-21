package com.javalimos.CronosUN.controlador;

import com.javalimos.CronosUN.constante.RutasApi;
import com.javalimos.CronosUN.servicio.RecuperacionClaveServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RecuperacionClaveControlador {
    private final RecuperacionClaveServicio servicio;
    public RecuperacionClaveControlador(RecuperacionClaveServicio servicio) {this.servicio=servicio;}

    @PostMapping(RutasApi.RECUPERACION_CLAVE)
    public ResponseEntity<?> recuperarClave(
            @Valid @RequestParam String correo){
        Integer idUsuario = servicio.realizarRecuperacionClave(correo);
        return ResponseEntity.ok(idUsuario);
    }
}
