package com.javalimos.CronosUN.modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Entity
@Data
@Table(name = "\"actividad\"")
public class Actividad {

    @Id
    @NotNull
    @Column(name = "\"act_id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "\"act_nombre\"", length = 100)
    private String titulo;

    @NotNull
    @Column(name = "\"act_descripcion\"", length = 200)
    private String descripcion;

    @NotNull
    @Column(name = "\"act_hora_inicio\"")
    @Temporal(TemporalType.TIME)
    private Date hora_inicio;

    @NotNull
    @Column(name = "\"act_hora_final\"")
    @Temporal(TemporalType.TIME)
    private Date hora_final;

    @NotNull
    @Column(name = "\"act_dias\"", length = 7)
    private String dias;

    @ToString.Exclude
    @JoinColumn(name = "\"act_hrp_usu_id\"", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @Valid
    private Usuario usuario;

    @ToString.Exclude
    @JoinColumn(name = "\"act_hrp_usu_id\"", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @Valid
    private HorarioPersonal horarioPersonal;

}
