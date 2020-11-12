package com.javalimos.CronosUN.controlador;

import com.javalimos.CronosUN.dto.OpcionAsignaturaDTO;
import com.javalimos.CronosUN.modelo.AsignaturaOpcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.javalimos.CronosUN.servicio.IOpcionAsignaturaServicio;

import com.javalimos.CronosUN.constante.RutasApi;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping( RutasApi.OPCION_ASIGNATURA )
public class OpcionAsignaturaControlador {
    
    /*@Autowired
    private IOpcionAsignaturaServicio servicio;*/
    
    /*@PostMapping
    public ResponseEntity<?> obtenerOpcionesAsignaturas(
            @Valid @RequestParam int idUsuario )
            throws Exception {
        
        Llamar a servicio
        List<OpcionAsignaturaDTO> asignaturas = servicio.obtenerOpcionesAsignaturas();
        
        return ResponseEntity.ok( asignaturas );
    }*/
    
}

// React

/* const funcion = async () => {
    const response = await fetch("/api/asignaturaOpcion", { queryParam: {
            idUsuario: autenticacion.id
        }});
    
    const asignaturas = await response.json();
} */
