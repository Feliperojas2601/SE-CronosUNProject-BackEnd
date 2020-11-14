package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table( name = "\"asignatura\"" )
public class Asignatura implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column( name = "\"asi_id\"", nullable = false )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;
    
    @NotBlank
    @Column( name = "\"asi_nombre\"", nullable = false )
    private String nombre;
    
    @NotBlank
    @Column( name = "\"asi_grupo\"", nullable = false )
    private String grupo;
    
    @NotNull
    @Column( name = "\"asi_hri_id\"", nullable = false )
    private Integer idHorarioInscripcion;
}