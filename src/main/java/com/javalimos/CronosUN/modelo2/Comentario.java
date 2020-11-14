package com.javalimos.CronosUN.modelo2;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table( name = "comentario" )
@Data
public class Comentario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Column( name = "com_contenido", nullable = false )
    private String comContenido;
    
    @Column( name = "com_fecha", nullable = false )
    private Date comFecha;
    
    @Column( name = "com_hora", nullable = false )
    private Time comHora;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "com_id", nullable = false )
    private Integer comId;
    
    @Column( name = "com_pro_id", nullable = false )
    private Integer comProId;
    
    @Column( name = "com_usu_id" )
    private Integer comUsuId;
    
}
