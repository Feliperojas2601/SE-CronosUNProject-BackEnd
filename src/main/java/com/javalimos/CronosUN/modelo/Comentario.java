package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "\"comentario\"" )
public class Comentario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column( name = "\"com_id\"", nullable = false )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;
    
    @NotBlank
    @Column( name = "\"com_contenido\"", nullable = false )
    private String contenido;
    
    @NotNull
    @Column( name = "\"com_fecha\"", nullable = false )
    @Temporal( TemporalType.DATE )
    private Date fecha;
    
    @NotNull
    @Column( name = "\"com_hora\"", nullable = false )
    @Temporal( TemporalType.TIME )
    private Date hora;
    
    @NotNull
    @Column( name = "\"com_pro_id\"", nullable = false )
    private Integer idProyecto;
    
    @NotNull
    @Column( name = "\"com_usu_id\"", nullable = false )
    private Integer idUsuario;
}
