package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table( name = "\"reporte\"" )
public class Reporte implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column( name = "\"rep_id\"", nullable = false )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;
    
    @NotBlank
    @Column( name = "\"rep_razon\"", nullable = false, length = 100 )
    private String razon;
    
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "\"rep_usu_id\"", nullable = false, insertable = false, updatable = false )
    @Valid
    private Usuario usuario;
    
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "\"rep_pro_id\"", nullable = false, insertable = false, updatable = false )
    @Valid
    private Proyecto proyecto;
}
