package com.javalimos.CronosUN.servicio;

import com.javalimos.CronosUN.repositorio.HorarioInscripcionRepository;
import com.javalimos.CronosUN.repositorio.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HorarioInscripcionServicio {

    @Autowired
    private final HorarioInscripcionRepository horarioInscripcionRepositorio;

    @Autowired
    private final UsuarioRepository usuarioRepositorio;


}
