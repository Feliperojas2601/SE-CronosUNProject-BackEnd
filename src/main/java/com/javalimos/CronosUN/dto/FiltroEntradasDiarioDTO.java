package com.javalimos.CronosUN.dto;


import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FiltroEntradasDiarioDTO {
    @NotNull
    private Integer idUsuario;
    
    @NotNull
    private int numeroPagina = 0;
    
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    @JsonFormat( pattern = "yyyy-MM-dd" )
    private Date fechaInicio;
    
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    @JsonFormat( pattern = "yyyy-MM-dd" )
    private Date fechaFin;
    
    @DateTimeFormat( pattern = "HH:mm:ss" )
    @JsonFormat( pattern = "HH:mm:ss" )
    private Date horaInicio;
    
    @DateTimeFormat( pattern = "HH:mm:ss" )
    @JsonFormat( pattern = "HH:mm:ss" )
    private Date horaFin;
    
    private List<Date> fechas;
}
