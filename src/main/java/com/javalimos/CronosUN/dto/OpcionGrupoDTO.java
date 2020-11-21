package com.javalimos.CronosUN.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class OpcionGrupoDTO implements Serializable {
    @NotNull
    private int numero;
    
    @NotBlank
    private String contenido;
}
