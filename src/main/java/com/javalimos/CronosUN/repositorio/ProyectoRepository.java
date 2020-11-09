package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProyectoRepository extends JpaRepository<Proyecto, Integer>, JpaSpecificationExecutor<Proyecto> {

}