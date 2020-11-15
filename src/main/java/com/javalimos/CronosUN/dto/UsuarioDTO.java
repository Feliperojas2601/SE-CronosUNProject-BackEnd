package com.javalimos.CronosUN.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO implements Serializable {
    
    @NotBlank
    private String nombre;
    
    @NotBlank
    private String correo;
    
    @NotBlank
    private String clave;
    
    @NotBlank
    @Size( min = 4, message = "El alias del usuario debe tener como minimo 45 caracteres." )
    @Size( max = 45, message = "El alias del usuario debe tener como maximo 45 caracteres." )
    private String alias;
    
    private String biografia;
}
