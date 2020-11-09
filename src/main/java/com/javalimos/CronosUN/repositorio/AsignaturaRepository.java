package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Integer>, JpaSpecificationExecutor<Asignatura> {

}