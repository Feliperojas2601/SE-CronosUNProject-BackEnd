package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Reporte;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReporteRepository extends CrudRepository<Reporte, Integer> {

}