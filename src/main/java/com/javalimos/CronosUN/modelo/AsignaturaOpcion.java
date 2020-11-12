package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
    private Integer id;
    
    @NotBlank
    @Column( name = "\"aso_nombre\"", nullable = false )
    private String nombre;
    
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "\"aso_usu_id\"", nullable = false, insertable = false, updatable = false )
    @Valid
    private Usuario usuario;
    
    @OneToMany( fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "asignaturaOpcion",
                orphanRemoval = true )
    @Valid
    List<Grupo> grupos = new ArrayList<>();
    
}
