package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.dto.EntradaDiarioDTO;
import com.javalimos.CronosUN.modelo.EntradaDiario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface EntradaDiarioRepository extends PagingAndSortingRepository<EntradaDiario, Integer> {
    Page<EntradaDiario> findAllAndFechaBetween( Date inicio, Date fin, Pageable paginacion );
    
    Page<EntradaDiario> findAllAndFechaBetweenAndHoraBetween( Date fechaInicio,
                                                              Date fechaFin,
                                                              Date horaInicio,
                                                              Date horaFin,
                                                              Pageable paginacion );
    
    Page<EntradaDiario> findByFechaIn( List<Date> fechas, Pageable paginacion );
}