package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table( name = "\"proyecto\"" )
public class Proyecto implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column( name = "\"pro_id\"", nullable = false )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;
    
    @NotBlank
    @Column( name = "\"pro_titulo\"", nullable = false, length = 45 )
    private String titulo;
    
    @Column( name = "\"pro_descripcion\"", length = 255 )
    private String descripcion;
    
    @Column( name = "\"pro_contenido\"", length = 10000 )
    private String contenido;
    
    @NotNull
    @Column( name = "\"pro_privacidad\"", nullable = false, columnDefinition = "tinyint" )
    private boolean privacidad;
    
    @NotBlank
    @Column( name = "\"pro_estado\"", nullable = false, length = 45 )
    private String estado;
    
    @NotNull
    @Column( name = "\"pro_fecha_creacion\"", nullable = false )
    @Temporal( TemporalType.DATE )
    private Date fechaCreacion;
    
    @Column( name = "\"pro_fecha_finalizacion\"" )
    @Temporal( TemporalType.DATE )
    private Date fechaFinalizacion;
    
    @NotBlank
    @Column( name = "\"pro_categoria\"", nullable = false, length = 45 )
    private String categoria;
    
    @ToString.Exclude
    @JoinColumn( name = "\"pro_usu_id\"", nullable = false, updatable = false )
    @ManyToOne( fetch = FetchType.LAZY )
    @Valid
    private Usuario usuario;
    
    @OneToMany( fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "proyecto",
            orphanRemoval = true )
    @Valid
    private List<Archivo> archivos = new ArrayList<>();
    
    @OneToMany( fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "proyecto",
            orphanRemoval = true )
    @Valid
    private List<Comentario> comentarios = new ArrayList<>();
    
    @OneToMany( fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "proyecto",
            orphanRemoval = true )
    @Valid
    private List<Reporte> reportes = new ArrayList<>();
    
}
