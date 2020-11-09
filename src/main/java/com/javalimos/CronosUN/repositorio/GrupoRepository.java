package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GrupoRepository extends JpaRepository<Grupo, Integer>, JpaSpecificationExecutor<Grupo> {

}