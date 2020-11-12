package com.javalimos.CronosUN.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class OpcionGrupoDTO implements Serializable {
    private int numeroGrupo;
    
    @NotBlank
    private String contenido;
}
