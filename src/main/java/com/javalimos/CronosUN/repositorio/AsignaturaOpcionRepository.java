package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.AsignaturaOpcion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaOpcionRepository extends CrudRepository<AsignaturaOpcion, Integer> {

}