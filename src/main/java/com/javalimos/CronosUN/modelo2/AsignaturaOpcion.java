package com.javalimos.CronosUN.modelo2;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table( name = "asignaturaopcion" )
public class AsignaturaOpcion implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column( name = "aso_id", nullable = false )
    private Integer asoId;
    
    @Column( name = "aso_nombre", nullable = false )
    private String asoNombre;
    
    @Column( name = "aso_usu_id", nullable = false )
    private Integer asoUsuId;
    
}
