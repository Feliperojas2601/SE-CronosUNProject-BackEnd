package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table( name = "\"actividad\"" )
public class Actividad implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column( name = "\"act_id\"", nullable = false )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;
    
    @NotBlank
    @Column( name = "\"act_nombre\"", nullable = false, length = 100 )
    private String titulo;
    
    @NotBlank
    @Column( name = "\"act_descripcion\"", nullable = false, length = 200 )
    private String descripcion;
    
    @NotNull
    @Column( name = "\"act_hora_inicio\"", nullable = false )
    @Temporal( TemporalType.TIME )
    private Date hora_inicio;
    
    @NotNull
    @Column( name = "\"act_hora_final\"", nullable = false )
    @Temporal( TemporalType.TIME )
    private Date hora_final;
    
    @NotBlank
    @Column( name = "\"act_dias\"", nullable = false, length = 7 )
    private String dias;
    
    @NotNull
    @Column( name = "\"act_hrp_usu_id\"", nullable = false )
    private Integer idUsuario;
    
    @NotNull
    @Column( name = "\"act_hrp_usu_id\"", nullable = false )
    private Integer idHorarioPersonal;
}
