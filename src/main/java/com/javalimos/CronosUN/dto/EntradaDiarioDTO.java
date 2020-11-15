package com.javalimos.CronosUN.dto;

import java.util.Date;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntradaDiarioDTO {
    
    @NotNull
    private Integer id;
    
    @NotNull
    private Date fecha;
    
    @NotBlank
    private String contenido;
    
    @NotNull
    private Date hora;
    
    @NotNull
    private Integer idUsuario;
}
