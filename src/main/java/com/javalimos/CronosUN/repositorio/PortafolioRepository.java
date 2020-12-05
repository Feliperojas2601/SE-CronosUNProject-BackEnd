package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.dto.ICategoria;
import com.javalimos.CronosUN.modelo.Proyecto;
import com.javalimos.CronosUN.modelo.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PortafolioRepository extends PagingAndSortingRepository<Proyecto, Integer> {
    Page<Proyecto> findAll( Specification<Proyecto> especificacion, Pageable paginacion );

    Page<Proyecto> findByUsuario( Usuario usuario, Pageable paginacion );
    
    List<ICategoria> findDistinctCategoriasByUsuario( Usuario usuario );
    
    Integer countByUsuario( Usuario usuarioActual );
}