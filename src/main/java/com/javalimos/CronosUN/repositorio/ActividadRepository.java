package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ActividadRepository extends JpaRepository<Actividad, Integer>, JpaSpecificationExecutor<Actividad> {

}