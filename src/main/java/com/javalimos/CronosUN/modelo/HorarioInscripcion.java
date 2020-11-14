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

@Entity
@Data
@Table( name = "\"horarioInscripcion\"" )
public class HorarioInscripcion implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "\"hri_id\"", nullable = false )
    private Integer id;
    
    @NotBlank
    @Column( name = "\"hri_nombre\"", nullable = false )
    private String nombre;
    
    @NotNull
    @Column( name = "\"hri_usu_id\"", nullable = false )
    private Integer idHorarioUsuario;
}
