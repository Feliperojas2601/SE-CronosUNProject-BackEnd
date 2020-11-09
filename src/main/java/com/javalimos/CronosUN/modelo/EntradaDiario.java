package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@Entity
@Table(name = "\"entradaDiario\"")
public class EntradaDiario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @Column(name = "\"ent_id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "\"ent_fecha\"")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @NotNull
    @Column(name = "\"ent_contenido\"", length = 255)
    private String contenido;

    @NotNull
    @Column(name = "\"ent_hora\"")
    @Temporal(TemporalType.TIME)
    private Date hora;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ent_usu_id", nullable = false)
    @Valid
    private Usuario usuario;

}
