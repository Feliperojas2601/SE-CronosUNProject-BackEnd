package com.javalimos.CronosUN.dto;

import com.javalimos.CronosUN.modelo.Asignatura;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
public class HorarioInscripcionDTO {

     // @NotNull
     private List<AsignaturaDTO> asignaturas;
     public HorarioInscripcionDTO(){

     }
}
