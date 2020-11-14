package com.javalimos.CronosUN.modelo2;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Table( name = "proyecto" )
@Entity
@Data
public class Proyecto implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Column( name = "pro_categoria", nullable = false )
    private String proCategoria;
    
    @Column( name = "pro_contenido" )
    private String proContenido;
    
    @Column( name = "pro_descripcion" )
    private String proDescripcion;
    
    @Column( name = "pro_estado", nullable = false )
    private String proEstado;
    
    @Column( name = "pro_fecha_creacion", nullable = false )
    private Date proFechaCreacion;
    
    @Column( name = "pro_fecha_finalizacion" )
    private Date proFechaFinalizacion;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "pro_id", nullable = false )
    private Integer proId;
    
    @Column( name = "pro_privacidad", nullable = false )
    private Boolean proPrivacidad;
    
    @Column( name = "pro_titulo", nullable = false )
    private String proTitulo;
    
    @Column( name = "pro_usu_id", nullable = false )
    private Integer proUsuId;
    
}
