package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Entity
@Table( name = "\"archivo\"" )
@Data
public class Archivo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column( name = "\"arc_id\"", nullable = false )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;
    
    @NotBlank
    @Size( max = 100, message = "El nombre del archivo no puede ser mayor a 100 caracteres." )
    @Column( name = "\"arc_nombre\"", nullable = false )
    private String nombre;
    
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "\"arc_pro_id\"", nullable = false )
    @Valid
    private Proyecto proyecto;
}
