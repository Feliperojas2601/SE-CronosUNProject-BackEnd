package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table( name = "\"reporte\"" )
public class Reporte implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "\"rep_id\"", nullable = false )
    private Integer id;
    
    @NotBlank
    @Column( name = "\"rep_razon\"", nullable = false )
    private String razon;
    
    @NotNull
    @Column( name = "\"rep_usu_id\"", nullable = false )
    private Integer idUsuario;
    
    @NotNull
    @Column( name = "rep_pro_id", nullable = false )
    private Integer idProyecto;
}
