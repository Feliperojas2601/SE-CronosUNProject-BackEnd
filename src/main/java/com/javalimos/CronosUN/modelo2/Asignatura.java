package com.javalimos.CronosUN.modelo2;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table( name = "asignatura" )
public class Asignatura implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Column( name = "asi_grupo", nullable = false )
    private String asiGrupo;
    
    @Column( name = "asi_hri_id", nullable = false )
    private Integer asiHriId;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "asi_id", nullable = false )
    private Integer asiId;
    
    @Column( name = "asi_nombre", nullable = false )
    private String asiNombre;
    
}
