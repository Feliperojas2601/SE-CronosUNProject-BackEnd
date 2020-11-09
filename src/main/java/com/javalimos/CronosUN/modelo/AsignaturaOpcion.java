package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Entity
@Data
@Table(name = "\"asignaturaopcion\"")
public class AsignaturaOpcion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "\"aso_id\"", nullable = false)
    private Integer id;

    @Column(name = "\"aso_nombre\"", nullable = false)
    private String nombre;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"aso_usu_id\"", nullable = false)
    @Valid
    private Usuario usuario;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "proyecto", orphanRemoval = true)
    @Valid
    List<Grupo> grupos = new ArrayList<>();

}
