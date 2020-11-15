package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Asignatura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaRepository extends CrudRepository<Asignatura, Integer> {

}