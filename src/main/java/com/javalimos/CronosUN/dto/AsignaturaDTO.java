package com.javalimos.CronosUN.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
public class AsignaturaDTO {

    //@NotBlank
    private String nombre;

    //@NotBlank
    private String creditos;

    //@NotNull
    private List<GrupoDTO> grupos;

    public AsignaturaDTO(){

    }
}
