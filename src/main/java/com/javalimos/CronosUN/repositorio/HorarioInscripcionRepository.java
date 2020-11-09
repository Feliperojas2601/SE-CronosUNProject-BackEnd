package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.HorarioInscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HorarioInscripcionRepository extends JpaRepository<HorarioInscripcion, Integer>, JpaSpecificationExecutor<HorarioInscripcion> {

}