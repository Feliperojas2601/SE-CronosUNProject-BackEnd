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
    @Column( name = "\"hrp_usu_id\"", nullable = false )
    private Integer id;
    
    @Column( name = "\"hrp_hri_id\"", nullable = false )
    private Integer idHorario;
}
