package com.javalimos.CronosUN.servicio;

import com.javalimos.CronosUN.dto.OpcionAsignaturaDTO;
import com.javalimos.CronosUN.mapeador.MapeadorOpcionAsignatura;
import com.javalimos.CronosUN.modelo.AsignaturaOpcion;
import com.javalimos.CronosUN.modelo.Grupo;
import com.javalimos.CronosUN.modelo.Usuario;
import com.javalimos.CronosUN.repositorio.AsignaturaOpcionRepository;
import com.javalimos.CronosUN.repositorio.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class OpcionAsignaturaServicio {
    @Autowired
    private final MapeadorOpcionAsignatura mapeador;

    @Autowired
    private final AsignaturaOpcionRepository repositorio;

    @Autowired
    private final UsuarioRepository usuarioRepositorio;

    public Integer realizarRegistroAsignaturaOpcion (OpcionAsignaturaDTO opcionAsignatura){
        Usuario usuarioactual = usuarioRepositorio.findById(opcionAsignatura.getIdUsuario()).get();
        AsignaturaOpcion asignaturaOpcionEntidad = mapeador.toAsignaturaOpcion(opcionAsignatura);
        List<Grupo> gruposEntidad = asignaturaOpcionEntidad.getGrupos();
        for (Grupo g : gruposEntidad){
            g.setAsignaturaOpcion(asignaturaOpcionEntidad);
        }
        asignaturaOpcionEntidad.setUsuario(usuarioactual);
        usuarioactual.getAsignaturasOpcion().add(asignaturaOpcionEntidad);
        Usuario usuarioGuardado = usuarioRepositorio.save(usuarioactual);
        return usuarioGuardado.getId();
    }
}
