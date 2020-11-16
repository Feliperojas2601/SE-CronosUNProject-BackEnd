/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javalimos.CronosUN.servicio;

import com.javalimos.CronosUN.dto.RegistroUsuarioDTO;
import com.javalimos.CronosUN.modelo.Usuario;
import com.javalimos.CronosUN.mapeador.MapeadorUsuario;
import com.javalimos.CronosUN.repositorio.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nicol Isoza
 */
@Service
@RequiredArgsConstructor
public class RegistroServicio {
    
    @Autowired
    private final MapeadorUsuario mapeador;
    
    private final UsuarioRepository repositorio;
    
    public Integer realizarRegistroUsuario( RegistroUsuarioDTO usuario){
        Usuario usuarioEntidad = mapeador.toUsuario(usuario);
        Usuario usuarioGuardado = repositorio.save(usuarioEntidad);
        return usuarioGuardado.getId();
    }
    
}
