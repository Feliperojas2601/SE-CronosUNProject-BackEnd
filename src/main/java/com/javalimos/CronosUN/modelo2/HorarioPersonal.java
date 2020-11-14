package com.javalimos.CronosUN.modelo2;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table( name = "horariopersonal" )
@Data
public class HorarioPersonal implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Column( name = "hrp_hri_id" )
    private Integer hrpHriId;
    
    @Id
    @Column( name = "hrp_usu_id", nullable = false )
    private Integer hrpUsuId;
    
}
