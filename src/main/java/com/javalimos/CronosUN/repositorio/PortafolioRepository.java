package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Proyecto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortafolioRepository extends PagingAndSortingRepository<Proyecto, Integer> {
    Page<Proyecto> findAll( Specification<Proyecto> especificacion, Pageable paginacion );
}