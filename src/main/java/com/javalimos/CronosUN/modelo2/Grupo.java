package com.javalimos.CronosUN.modelo2;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table( name = "grupo" )
public class Grupo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Column( name = "gru_aso_id", nullable = false )
    private Integer gruAsoId;
    
    @Column( name = "gru_contenido", nullable = false )
    private String gruContenido;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "gru_id", nullable = false )
    private Integer gruId;
    
    @Column( name = "gru_numero", nullable = false )
    private Integer gruNumero;
    
}
