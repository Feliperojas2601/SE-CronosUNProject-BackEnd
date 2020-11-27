package com.javalimos.CronosUN.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "\"usuario\"" )
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column( name = "\"usu_id\"", nullable = false )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;
    
    @NotBlank
    @Column( name = "\"usu_nombre\"", nullable = false, length = 45 )
    private String nombre;
    
    @NotBlank
    @Column( name = "\"usu_correo\"", nullable = false, length = 320 , unique = true)
    private String correo;
    
    @NotBlank
    @Column( name = "\"usu_clave\"", nullable = false, length = 127 )
    private String clave;
    
    @NotBlank
    @Column( name = "\"usu_alias\"", nullable = false, length = 45 )
    @Size( min = 4, message = "El alias del usuario debe tener como minimo 45 caracteres." )
    @Size( max = 45, message = "El alias del usuario debe tener como maximo 45 caracteres." )
    private String alias;
    
    @Column( name = "\"usu_biografia\"", length = 515 )
    private String biografia;
    
    @OneToMany( fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "usuario",
                orphanRemoval = true )
    @Valid
    private List<Reporte> reportes = new ArrayList<>();
    
    @OneToMany( fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "usuario",
                orphanRemoval = true )
    @Valid
    private List<Proyecto> proyectos = new ArrayList<>();
    
    @OneToMany( fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "usuario",
                orphanRemoval = true )
    @Valid
    private List<EntradaDiario> entradasDiario = new ArrayList<>();
    
    @OneToMany( fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "usuario",
                orphanRemoval = true )
    @Valid
    private List<Comentario> comentarios = new ArrayList<>();
    
    @OneToMany( fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "usuario",
                orphanRemoval = true )
    @Valid
    private List<AsignaturaOpcion> asignaturasOpcion = new ArrayList<>();
    
    @OneToMany( fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "usuario",
                orphanRemoval = true )
    @Valid
    private List<HorarioInscripcion> horariosInscripcion = new ArrayList<>();
    
    @OneToOne( fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "usuario",
                orphanRemoval = true )
    @Valid
    private HorarioPersonal horarioPersonal;
}
