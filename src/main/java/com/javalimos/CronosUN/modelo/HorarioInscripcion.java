package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table( name = "\"horarioInscripcion\"" )
public class HorarioInscripcion implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column( name = "\"hri_id\"", nullable = false )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;
    
    @NotBlank
    @Column( name = "\"hri_nombre\"", nullable = false )
    private String nombre;
    
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "\"hri_usu_id\"", nullable = false, insertable = false, updatable = false )
    @Valid
    private Usuario usuario;
    
    @OneToOne( fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "horarioInscripcion",
                orphanRemoval = true )
    @Valid
    private HorarioPersonal horarioPersonal;
    
    @OneToMany( fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "horarioInscripcion",
                orphanRemoval = true )
    @Valid
    List<Asignatura> asignaturas = new ArrayList<>();
    
}
