package com.javalimos.CronosUN.dto;


import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FiltroEntradasDiarioDTO {
    @NotNull
    private Integer idUsuario;
    
    @NotNull
    private int numeroPagina = 0;
    
    private Date fechaInicio;
    
    private Date fechaFin;
    
    private Date horaInicio;
    
    private Date horaFin;
    
    private List<Date> fechas;
}
