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
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@Entity
@Table(name = "\"asignatura\"")
public class Asignatura implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @Column(name = "\"asi_id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "\"asi_nombre\"", length = 100)
    private String nombre;

    @NotNull
    @Column(name = "\"asi_grupo\"", length = 1000)
    private String grupo;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"asi_hri_id\"", nullable = false)
    @Valid
    private HorarioInscripcion horarioInscripcion;

}