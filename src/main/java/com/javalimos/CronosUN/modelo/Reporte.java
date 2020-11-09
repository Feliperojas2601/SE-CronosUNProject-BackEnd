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
@Table(name = "\"reporte\"")

public class Reporte implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @Column(name = "\"rep_id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "\"rep_razon\"", length = 100)
    private String razon;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"rep_usu_id\"", nullable = false)
    @Valid
    private Usuario usuario;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"rep_pro_id\"", nullable = false)
    @Valid
    private Proyecto proyecto;
}
