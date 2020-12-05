package com.javalimos.CronosUN.controlador;

import com.javalimos.CronosUN.servicio.HorarioInscripcionServicio;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin (origins = "http://localhost:3000")
public class HorarioInscripcionControlador {
    private final HorarioInscripcionServicio  servicio;
    public HorarioInscripcionControlador(HorarioInscripcionServicio servicio){this.servicio=servicio;}


}
