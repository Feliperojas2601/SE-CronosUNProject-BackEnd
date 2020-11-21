package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table( name = "\"asignaturaOpcion\"" )
public class AsignaturaOpcion implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column( name = "\"aso_id\"", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotBlank
    @Column( name = "\"aso_nombre\"", nullable = false )
    private String nombre;

    @NotBlank
    @Column( name = "\"aso_creditos\"", nullable = false )
    private String creditos;

    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "\"aso_usu_id\"", nullable = false)
    @Valid
    private Usuario usuario;
    
    @OneToMany( fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "asignaturaOpcion",
                orphanRemoval = true )
    @Valid
    List<Grupo> grupos = new ArrayList<>();
    
}
