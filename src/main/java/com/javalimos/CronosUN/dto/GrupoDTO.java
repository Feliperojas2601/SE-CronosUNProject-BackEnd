package com.javalimos.CronosUN.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@AllArgsConstructor
public class GrupoDTO {

    //@NotBlank
    private String numero;

    //@NotBlank
    private List<String> horas;

    //@NotBlank
    private List<String> dias;

    //@NotBlank
    private String profesor;

    public GrupoDTO(){

    }

}

