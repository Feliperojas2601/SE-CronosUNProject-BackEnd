package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.dto.EntradaDiarioDTO;
import com.javalimos.CronosUN.modelo.EntradaDiario;
import com.javalimos.CronosUN.modelo.Usuario;
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
    Page<EntradaDiario> findByUsuarioAndFechaBetween( Usuario usuario, Date inicio, Date fin, Pageable paginacion );
    
    Page<EntradaDiario> findByUsuarioAndFechaBetweenAndHoraBetween(
            Usuario usuario,
            Date fechaInicio,
            Date fechaFin,
            Date horaInicio,
            Date horaFin,
            Pageable paginacion
    );
    
    Page<EntradaDiario> findByUsuarioAndFechaIn( Usuario usuario, List<Date> fechas, Pageable paginacion );
}