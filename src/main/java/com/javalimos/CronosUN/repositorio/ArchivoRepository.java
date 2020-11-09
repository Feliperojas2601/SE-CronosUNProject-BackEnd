package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Archivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ArchivoRepository extends JpaRepository<Archivo, Integer>, JpaSpecificationExecutor<Archivo> {

}