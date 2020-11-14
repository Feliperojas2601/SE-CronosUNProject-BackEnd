package com.javalimos.CronosUN.modelo2;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table( name = "usuario" )
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Column( name = "usu_alias", nullable = false )
    private String usuAlias;
    
    @Column( name = "usu_biografia" )
    private String usuBiografia;
    
    @Column( name = "usu_clave", nullable = false )
    private String usuClave;
    
    @Column( name = "usu_correo", nullable = false )
    private String usuCorreo;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "usu_id", nullable = false )
    private Integer usuId;
    
    @Column( name = "usu_nombre", nullable = false )
    private String usuNombre;
    
}
