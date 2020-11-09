package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Entity
@Data
@Table(name = "\"horarioinscripcion\"")
public class HorarioInscripcion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"hri_id\"", nullable = false)
    private Integer id;

    @Column(name = "\"hri_nombre\"", nullable = false)
    private String nombre;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"hri_usu_id\"", nullable = false)
    @Valid
    private Usuario usuario;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "horarioInscripcion", orphanRemoval = true)
    @Valid
    private HorarioPersonal horarioPersonal;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "horarioInscripcion", orphanRemoval = true)
    @Valid
    List<Asignatura> asignaturas = new ArrayList<>();

}
