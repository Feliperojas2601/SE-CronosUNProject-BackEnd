package com.javalimos.CronosUN.servicio;

import com.javalimos.CronosUN.dto.FiltroProyectosPortafolioDTO;
import com.javalimos.CronosUN.dto.ProyectoDTO;
import com.javalimos.CronosUN.especificacion.EspecificacionProyecto;
import com.javalimos.CronosUN.mapeador.MapeadorProyecto;
import com.javalimos.CronosUN.modelo.Proyecto;
import com.javalimos.CronosUN.modelo.Usuario;
import com.javalimos.CronosUN.repositorio.PortafolioRepository;
import com.javalimos.CronosUN.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PortafolioServicio {
    
    @Autowired
    private MapeadorProyecto mapeadorProyecto;
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Autowired
    private PortafolioRepository portafolioRepository;
    
    private static final int TAMANIO_PAGINA = 10;
    
    public ProyectoDTO consultarProyectoPortafolio( Integer idProyecto ) {
        Proyecto proyectoConsultado = portafolioRepository.findById( idProyecto ).get();
        ProyectoDTO proyectoConsultadoDTO = mapeadorProyecto.toProyectoDTO( proyectoConsultado );
        return proyectoConsultadoDTO;
    }
    
    public ProyectoDTO registrarProyectoPortafolio( ProyectoDTO nuevoProyecto ) {
        Usuario usuarioActual = usuarioRepository.findById( nuevoProyecto.getIdUsuario() ).get();
        Proyecto proyecto = mapeadorProyecto.toProyecto( nuevoProyecto );
        proyecto.setUsuario( usuarioActual );
        ProyectoDTO proyectoGuardado = mapeadorProyecto.toProyectoDTO( portafolioRepository.save( proyecto ) );
        return proyectoGuardado;
    }
    
    public ProyectoDTO actualizarProyectoPortafolio( Integer idProyecto, ProyectoDTO proyectoEditado ) {
        proyectoEditado.setId( idProyecto );
        return registrarProyectoPortafolio( proyectoEditado );
    }
    
    public List<ProyectoDTO> obtenerProyectosPortafolio( FiltroProyectosPortafolioDTO datosFiltro ) {
        Pageable paginacion = PageRequest.of( datosFiltro.getNumeroPagina(), TAMANIO_PAGINA );
        Page<Proyecto> resultadoProyectos = filtrarProyectosPortafolio( datosFiltro, paginacion );
        return obtenerResultadoFiltroProyectosPortafolio( resultadoProyectos );
    }
    
    private Page<Proyecto> filtrarProyectosPortafolio( FiltroProyectosPortafolioDTO datosFiltro, Pageable paginacion ) {
        Usuario usuarioActual = usuarioRepository.findById( datosFiltro.getIdUsuario() ).get();
        EspecificacionProyecto especificacionProyecto = new EspecificacionProyecto( datosFiltro, usuarioActual );
        
        return portafolioRepository.findAll( especificacionProyecto, paginacion );
    }
    
    private List<ProyectoDTO> obtenerResultadoFiltroProyectosPortafolio( Page<Proyecto> resultadoProyectos ) {
        if ( resultadoProyectos.hasContent() ) {
            return resultadoProyectos
                    .getContent()
                    .stream()
                    .map( mapeadorProyecto::toProyectoDTO )
                    .collect( Collectors.toList() );
        }
        return new ArrayList<ProyectoDTO>();
    }
    
    public boolean eliminarProyectoPortafolio( Integer idProyecto ) {
        if ( portafolioRepository.existsById( idProyecto ) ) {
            portafolioRepository.deleteById( idProyecto );
            return true;
        }
        return false;
    }
}
