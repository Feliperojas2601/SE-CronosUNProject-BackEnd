package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Archivo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchivoRepository extends CrudRepository<Archivo, Integer> {

}