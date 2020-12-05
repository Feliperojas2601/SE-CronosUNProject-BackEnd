package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Entity
@Table( name = "\"entradaDiario\"" )
public class EntradaDiario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column( name = "\"ent_id\"", nullable = false )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;
    
    @NotNull
    @Column( name = "\"ent_fecha\"", nullable = false )
    @Temporal( TemporalType.DATE )
    private Date fecha;
    
    @NotBlank
    @Column( name = "\"ent_contenido\"", nullable = false )
    private String contenido;
    
    @NotNull
    @Column( name = "\"ent_hora\"", nullable = false )
    @Temporal( TemporalType.TIME )
    private Date hora;
    
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "ent_usu_id", nullable = false, updatable = false )
    @Valid
    private Usuario usuario;
}
