package com.javalimos.CronosUN.servicio;

import com.javalimos.CronosUN.dto.AsignaturaDTO;
import com.javalimos.CronosUN.dto.GrupoDTO;
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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@Service
@RequiredArgsConstructor
public class OpcionAsignaturaServicio {
    @Autowired
    private final MapeadorOpcionAsignatura mapeador;

    @Autowired
    private final AsignaturaOpcionRepository opcionAsignaturaRepositorio;

    @Autowired
    private final UsuarioRepository usuarioRepositorio;
    public Integer restablecerAsignaturaOpcion(Integer idUsuario){
        Usuario usuarioactual = usuarioRepositorio.findById(idUsuario).get();
        opcionAsignaturaRepositorio.deleteByUsuario(usuarioactual);
        return usuarioactual.getId();
    }

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
    public List<AsignaturaDTO> obtenerOpcionesAsignatura (Integer idUsuario){
        Usuario usuarioActual = usuarioRepositorio.findById(idUsuario).get();
        List<AsignaturaOpcion> asignaturasOpcion = opcionAsignaturaRepositorio.findByUsuario(usuarioActual);
        List<AsignaturaDTO> asignaturaDTOS = new ArrayList<>();
        for(AsignaturaOpcion ao: asignaturasOpcion) {
            List<Grupo> grupos = ao.getGrupos();
            AsignaturaDTO asignaturaDTO = new AsignaturaDTO();
            List<GrupoDTO> grupoDTOS = new ArrayList<>();

            for (Grupo g : grupos) {
                Scanner sc = new Scanner(g.getContenido());
                sc.next();
                String numero = sc.next();
                String profesor ="";
                List <String> dias = new ArrayList<>();
                List <String> horas = new ArrayList<>();
                GrupoDTO grupoDTO = new GrupoDTO();
                sc.next();
                String aux = sc.next();
                while (!aux.equals("Facultad:")) {
                    profesor = profesor + " " + aux;
                    aux=sc.next();
                }
                while(!aux.equals("Cupos")){
                    if(aux.equals("LUNES")|| aux.equals("MARTES")||aux.equals("MIÉRCOLES")||aux.equals("JUEVES")||aux.equals("VIERNES")||aux.equals("SÁBADO")) {
                        String hora = "";
                        dias.add(aux);
                        aux = sc.next();
                        aux = sc.next();
                        hora = aux;
                        aux = sc.next();
                        aux = sc.next();
                        hora = hora+"-"+aux;
                        horas.add(hora);
                    }
                    aux=sc.next();
                }
                grupoDTO.setNumero(numero);
                grupoDTO.setProfesor(profesor);
                grupoDTO.setHoras(horas);
                grupoDTO.setDias(dias);
                grupoDTOS.add(grupoDTO);
            }

            asignaturaDTO.setNombre(ao.getNombre());
            asignaturaDTO.setCreditos(ao.getCreditos());
            asignaturaDTO.setGrupos(grupoDTOS);
            asignaturaDTOS.add(asignaturaDTO);
        }
        return asignaturaDTOS;
    }
}
