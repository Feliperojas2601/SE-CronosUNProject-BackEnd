package com.javalimos.CronosUN.dto;

import com.javalimos.CronosUN.modelo.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class UsuarioDTO implements Serializable {
    @NotBlank
    private String nombre;
    
    @NotBlank
    private String correo;
    
    @NotBlank
    private String clave;
    
    @NotBlank
    private String alias;
    
    public UsuarioDTO( String nombre, String correo, String clave, String alias ) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.alias = alias;
    }
}
