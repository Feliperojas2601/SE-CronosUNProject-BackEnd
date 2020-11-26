package com.javalimos.CronosUN.dto;

import lombok.*;

import java.io.Serializable;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InformacionUsuarioDTO implements Serializable{

    @NotNull
    private Integer id;

}
