package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.validation.Valid;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table( name = "\"horarioPersonal\"" )
public class HorarioPersonal implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column( name = "\"hrp_usu_id\"" )
    private Integer id;
    
    @MapsId
    @ToString.Exclude
    @OneToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "\"hrp_usu_id\"" )
    @Valid
    private Usuario usuario;
    
    @ToString.Exclude
    @OneToOne
    @JoinColumn( name = "\"hrp_hri_id\"" )
    @Valid
    private HorarioInscripcion horarioInscripcion;
    
    @OneToMany( fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "horarioPersonal",
                orphanRemoval = true )
    @Valid
    List<Actividad> actividades = new ArrayList<>();
}
