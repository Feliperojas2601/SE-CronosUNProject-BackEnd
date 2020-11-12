package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.ToString;

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
    @Column( name = "\"asi_nombre\"", nullable = false, length = 100 )
    private String nombre;
    
    @NotBlank
    @Column( name = "\"asi_grupo\"", nullable = false, length = 1000 )
    private String grupo;
    
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "\"asi_hri_id\"", nullable = false, insertable = false, updatable = false )
    @Valid
    private HorarioInscripcion horarioInscripcion;
}