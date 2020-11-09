package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.AsignaturaOpcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AsignaturaOpcionRepository extends JpaRepository<AsignaturaOpcion, Integer>, JpaSpecificationExecutor<AsignaturaOpcion> {

}