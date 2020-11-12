package com.javalimos.CronosUN.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO implements Serializable {
    private String nombre;
    private String correo;
    private String clave;
    private String alias;
    private String biografia;
}
