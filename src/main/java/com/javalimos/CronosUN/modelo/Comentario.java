package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "\"comentario\"")
public class Comentario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @Column(name = "\"com_id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "\"com_contenido\"", length = 255)
    private String contenido;

    @NotNull
    @Column(name = "\"com_fecha\"")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @NotNull
    @Column(name = "\"com_hora\"")
    @Temporal(TemporalType.TIME)
    private Date hora;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"com_pro_id\"", nullable = false)
    @Valid
    private Proyecto proyecto;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"com_usu_id\"", nullable = false)
    @Valid
    private Usuario usuario;
}
