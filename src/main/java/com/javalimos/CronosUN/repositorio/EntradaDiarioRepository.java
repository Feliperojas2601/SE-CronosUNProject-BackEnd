package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.EntradaDiario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EntradaDiarioRepository extends JpaRepository<EntradaDiario, Integer>, JpaSpecificationExecutor<EntradaDiario> {

}