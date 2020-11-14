package com.javalimos.CronosUN.modelo2;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "archivo" )
@Data
public class Archivo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "arc_id", nullable = false )
    private Integer arcId;
    
    @Column( name = "arc_nombre", nullable = false )
    private String arcNombre;
    
    @Column( name = "arc_pro_id", nullable = false )
    private Integer arcProId;
    
}
