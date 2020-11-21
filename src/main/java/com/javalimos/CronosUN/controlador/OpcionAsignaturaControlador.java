package com.javalimos.CronosUN.controlador;

import com.javalimos.CronosUN.dto.OpcionAsignaturaDTO;
import com.javalimos.CronosUN.servicio.OpcionAsignaturaServicio;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.javalimos.CronosUN.constante.RutasApi;

import javax.validation.Valid;


@RestController
@RequestMapping( RutasApi.OPCION_ASIGNATURA )
public class OpcionAsignaturaControlador {
    private final OpcionAsignaturaServicio servicio;
    public OpcionAsignaturaControlador (OpcionAsignaturaServicio servicio)   {this.servicio=servicio;}

    @PostMapping
    public ResponseEntity<?> realizarRegistroAsignaturaOpcion(
            @Valid @RequestBody OpcionAsignaturaDTO opcionAsignaturaDTO){
            Integer idUsuario = servicio.realizarRegistroAsignaturaOpcion(opcionAsignaturaDTO);
            return ResponseEntity.ok(idUsuario);
    }
}

