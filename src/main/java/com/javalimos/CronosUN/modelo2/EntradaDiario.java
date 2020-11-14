package com.javalimos.CronosUN.modelo2;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table( name = "entradadiario" )
@Data
public class EntradaDiario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Column( name = "ent_contenido", nullable = false )
    private String entContenido;
    
    @Column( name = "ent_fecha", nullable = false )
    private Date entFecha;
    
    @Column( name = "ent_hora", nullable = false )
    private Time entHora;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "ent_id", nullable = false )
    private Integer entId;
    
    @Column( name = "ent_usu_id", nullable = false )
    private Integer entUsuId;
    
}
