package com.javalimos.CronosUN.controlador;

import org.springframework.web.bind.annotation.*;


import com.javalimos.CronosUN.constante.RutasApi;


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
