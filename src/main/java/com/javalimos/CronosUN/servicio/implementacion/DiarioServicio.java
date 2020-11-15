package com.javalimos.CronosUN.servicio.implementacion;

import com.javalimos.CronosUN.dto.EntradaDiarioDTO;
import com.javalimos.CronosUN.dto.FiltroEntradasDiarioDTO;
import com.javalimos.CronosUN.mapeador.MapeadorEntradaDiario;
import com.javalimos.CronosUN.modelo.EntradaDiario;
import com.javalimos.CronosUN.repositorio.EntradaDiarioRepository;
import com.javalimos.CronosUN.repositorio.UsuarioRepository;
import com.javalimos.CronosUN.servicio.IDiarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiarioServicio implements IDiarioServicio {
    
    @Autowired
    private MapeadorEntradaDiario mapeadorEntradaDiario;
    
    @Autowired
    private EntradaDiarioRepository entradaDiarioRepository;
    
    private static final int TAMANIO_PAGINA = 10;
    
    public List<EntradaDiarioDTO> obtenerEntradasDiario( FiltroEntradasDiarioDTO datosFiltro ) {
        Pageable paginacion = PageRequest.of( datosFiltro.getNumeroPagina(), TAMANIO_PAGINA );
        Page<EntradaDiario> resultadoEntradas = filtrarEntradasDiario( datosFiltro, paginacion );
        return obtenerResultadoFiltroEntradasDiario( resultadoEntradas );
    }
    
    private Page<EntradaDiario> filtrarEntradasDiario( FiltroEntradasDiarioDTO datosFiltro, Pageable paginacion ) {
        Date fechaInicial = datosFiltro.getFechaInicial();
        Date fechaFinal = datosFiltro.getFechaFinal();
        List<Date> fechas = datosFiltro.getFechas();
    
        if ( fechaInicial != null && fechaFinal != null ) {
            return filtrarEntradasDiarioPorRango( datosFiltro, paginacion );
        }
        
        if ( fechas.size() > 0 ) {
            return entradaDiarioRepository.findByFechaIn( fechas, paginacion );
        }
        return entradaDiarioRepository.findAll( paginacion );
    }
    
    private Page<EntradaDiario> filtrarEntradasDiarioPorRango( FiltroEntradasDiarioDTO datosFiltro, Pageable paginacion ) {
        Date horaInicial = datosFiltro.getHoraInicial();
        Date horaFinal = datosFiltro.getHoraFinal();
        
        if ( horaInicial != null && horaFinal != null ) {
            return entradaDiarioRepository.findAllAndFechaBetweenAndHoraBetween( fechaInicial, fechaFinal, horaInicial, horaFinal, paginacion );
        }
        return entradaDiarioRepository.findAllAndFechaBetween( datosFiltro.getFechaInicial(), datosFiltro.getFechaFinal(), paginacion );
    }
    
    private List<EntradaDiarioDTO> obtenerResultadoFiltroEntradasDiario( Page<EntradaDiario> resultadoEntradas ) {
        if ( resultadoEntradas.hasContent() ) {
            return resultadoEntradas
                    .getContent()
                    .stream()
                    .map( mapeadorEntradaDiario::toEntradaDiarioDTO )
                    .collect( Collectors.toList() );
        }
        
        return new ArrayList<EntradaDiarioDTO>();
    }
    
    @Override
    public boolean registrarEntradaDiario( EntradaDiarioDTO nuevaEntradaDiario ) {
        if ( !entradaDiarioRepository.existsById( nuevaEntradaDiario.getId() ) ) {
            EntradaDiario entradaDiario = mapeadorEntradaDiario.toEntradaDiario( nuevaEntradaDiario );
            entradaDiarioRepository.save( entradaDiario );
            return true;
        }
        return false;
    }
    
    @Override
    public boolean eliminarEntradaDiario( int idEntrada ) {
        if ( entradaDiarioRepository.existsById( idEntrada ) ) {
            entradaDiarioRepository.deleteById( idEntrada );
            return true;
        }
        return false;
    }
}