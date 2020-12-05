package com.javalimos.CronosUN.especificacion;

import com.javalimos.CronosUN.dto.FiltroProyectosPortafolioDTO;
import com.javalimos.CronosUN.modelo.Proyecto;
import com.javalimos.CronosUN.modelo.Usuario;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EspecificacionProyecto implements Specification<Proyecto> {
    private FiltroProyectosPortafolioDTO criterioBusqueda;
    private Usuario usuarioActual;
    
    public EspecificacionProyecto( FiltroProyectosPortafolioDTO criterioBusqueda, Usuario usuarioActual ) {
        this.criterioBusqueda = criterioBusqueda;
        this.usuarioActual = usuarioActual;
    }
    
    @Override
    public Predicate toPredicate( Root<Proyecto> proyecto, CriteriaQuery<?> consulta,
                                  CriteriaBuilder criteriaBuilder ) {
        List<Predicate> filtros = new ArrayList<Predicate>();
        
        Predicate seleccionUsuario = criteriaBuilder.equal( proyecto.<Usuario>get( "usuario" ), usuarioActual );
        filtros.add( seleccionUsuario );
        
        String titulo = criterioBusqueda.getTitulo();
        
        if ( titulo != null ) {
            Predicate filtroTitulo = criteriaBuilder.like( proyecto.<String>get( "titulo" ), "%" + titulo + "%" );
            filtros.add( filtroTitulo );
        }
        
        Date fechaInicio = criterioBusqueda.getFechaInicio();
        Date fechaFin = criterioBusqueda.getFechaFin();
        
        if ( fechaInicio != null && fechaFin != null ) {
            Predicate filtroFechaLimiteInicio = criteriaBuilder.greaterThanOrEqualTo( proyecto.<Date>get( "fechaCreacion" ), fechaInicio );
            Predicate filtroFechaLimiteFin = criteriaBuilder.lessThanOrEqualTo( proyecto.<Date>get( "fechaCreacion" ), fechaFin );
            filtros.add( criteriaBuilder.and( filtroFechaLimiteInicio, filtroFechaLimiteFin ) );
        } else if ( fechaInicio != null ) {
            Predicate filtroFechaLimiteInicio = criteriaBuilder.greaterThanOrEqualTo( proyecto.<Date>get( "fechaCreacion" ), fechaInicio );
            filtros.add( filtroFechaLimiteInicio );
        } else if ( fechaFin != null ) {
            Predicate filtroFechaLimiteFin = criteriaBuilder.lessThanOrEqualTo( proyecto.<Date>get( "fechaCreacion" ), fechaFin );
            filtros.add( filtroFechaLimiteFin );
        }
        
        Boolean esPrivado = criterioBusqueda.getPrivado();
        
        if ( esPrivado != null ) {
            Predicate filtroPrivacidad = criteriaBuilder.equal( proyecto.<Boolean>get( "privacidad" ), esPrivado.booleanValue() );
            filtros.add( filtroPrivacidad );
        }
        
        String estado = criterioBusqueda.getEstado();
        
        if ( estado != null && !estado.isEmpty() ) {
            Predicate filtroEstado = criteriaBuilder.equal( proyecto.<String>get( "estado" ), estado );
            filtros.add( filtroEstado );
        }
        
        List<String> categorias = criterioBusqueda.getCategorias();
        
        if ( categorias != null && !categorias.isEmpty() ) {
            Predicate filtroCategorias = proyecto.<String>get( "categoria" ).in( categorias );
            filtros.add( filtroCategorias );
        }
        
        return criteriaBuilder.and( filtros.toArray( new Predicate[ 0 ] ) );
    }
}
