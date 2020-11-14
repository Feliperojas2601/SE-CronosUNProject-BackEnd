package com.javalimos.CronosUN.modelo2;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "reporte" )
@Data
public class Reporte implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "rep_id", nullable = false )
    private Integer repId;
    
    @Column( name = "rep_pro_id", nullable = false )
    private Integer repProId;
    
    @Column( name = "rep_razon", nullable = false )
    private String repRazon;
    
    @Column( name = "rep_usu_id", nullable = false )
    private Integer repUsuId;
    
}
