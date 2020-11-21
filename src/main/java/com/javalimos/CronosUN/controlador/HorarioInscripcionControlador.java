package com.javalimos.CronosUN.controlador;

import com.javalimos.CronosUN.constante.RutasApi;
import com.javalimos.CronosUN.dto.HorarioInscripcionDTO;

import com.javalimos.CronosUN.servicio.HorarioInscripcionServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class HorarioInscripcionControlador {
    private final HorarioInscripcionServicio  servicio;
    public HorarioInscripcionControlador(HorarioInscripcionServicio servicio){this.servicio=servicio;}

    @PostMapping ( RutasApi.HORARIO_INSCRIPCION )
    public ResponseEntity<?> realizarRegistroHorarioInscripción(
            @Valid @RequestParam Integer idUsuario){
        HorarioInscripcionDTO horarioUsuario = servicio.realizarRegistroHorarioInscripcion(idUsuario);
        return ResponseEntity.ok(horarioUsuario);
    }
}
