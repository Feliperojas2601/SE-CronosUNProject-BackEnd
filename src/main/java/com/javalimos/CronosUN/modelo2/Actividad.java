package com.javalimos.CronosUN.modelo2;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Data
@Table( name = "actividad" )
public class Actividad implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Column( name = "act_descripcion", nullable = false )
    private String actDescripcion;
    
    @Column( name = "act_dias", nullable = false )
    private String actDias;
    
    @Column( name = "act_hora_final", nullable = false )
    private Time actHoraFinal;
    
    @Column( name = "act_hora_inicio", nullable = false )
    private Time actHoraInicio;
    
    @Column( name = "act_hrp_usu_id", nullable = false )
    private Integer actHrpUsuId;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "act_id", nullable = false )
    private Integer actId;
    
    @Column( name = "act_nombre", nullable = false )
    private String actNombre;
    
}
