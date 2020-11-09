package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ReporteRepository extends JpaRepository<Reporte, Integer>, JpaSpecificationExecutor<Reporte> {

}