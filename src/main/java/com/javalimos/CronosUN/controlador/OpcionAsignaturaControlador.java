package com.javalimos.CronosUN.controlador;

import com.javalimos.CronosUN.dto.AsignaturaDTO;
import com.javalimos.CronosUN.dto.OpcionAsignaturaDTO;
import com.javalimos.CronosUN.servicio.OpcionAsignaturaServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.javalimos.CronosUN.constante.RutasApi;

import javax.validation.Valid;
import java.util.List;


@RestController
@CrossOrigin (origins = "http://localhost:3000")
public class OpcionAsignaturaControlador {
    private final OpcionAsignaturaServicio servicio;
    public OpcionAsignaturaControlador (OpcionAsignaturaServicio servicio)   {this.servicio=servicio;}

    @PostMapping (RutasApi.REGISTRO_OPCION_ASIGNATURA)
    public ResponseEntity<?> realizarRegistroAsignaturaOpcion(
            @Valid @RequestBody OpcionAsignaturaDTO opcionAsignaturaDTO){
            Integer idUsuario = servicio.realizarRegistroAsignaturaOpcion(opcionAsignaturaDTO);
            return ResponseEntity.ok(idUsuario);
    }
    @GetMapping ( RutasApi.OPCIONES_ASIGNATURAS )
    public ResponseEntity<?> obtenerOpcionesAsignatura(
            @Valid @RequestParam Integer idUsuario){
        List<AsignaturaDTO> opcionesAsignatura = servicio.obtenerOpcionesAsignatura(idUsuario);
        return ResponseEntity.ok(opcionesAsignatura);
    }
    @DeleteMapping (RutasApi.RESTABLECER_OPCION_ASIGNATURA)
    public ResponseEntity<?> restablecerAsignaturaOpcion(
            @Valid @RequestParam Integer idUsuario){
        Integer respuesta = servicio.restablecerAsignaturaOpcion(idUsuario);
        return ResponseEntity.ok(respuesta);
    }
}

