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
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@Entity
@Table( name = "\"grupo\"" )
public class Grupo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column( name = "\"gru_id\"", nullable = false )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;
    
    @NotNull
    @Min( 1 )
    @Column( name = "\"gru_numero\"", nullable = false )
    private int numero;
    
    @NotNull
    @Column( name = "\"gru_contenido\"", nullable = false, length = 1200 )
    private String contenido;
    
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "\"gru_aso_id\"", nullable = false )
    @Valid
    private AsignaturaOpcion asignaturaOpcion;
    
}
