package com.javalimos.CronosUN.modelo2;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table( name = "horarioinscripcion" )
public class HorarioInscripcion implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "hri_id", nullable = false )
    private Integer hriId;
    
    @Column( name = "hri_nombre", nullable = false )
    private String hriNombre;
    
    @Column( name = "hri_usu_id", nullable = false )
    private Integer hriUsuId;
    
}
