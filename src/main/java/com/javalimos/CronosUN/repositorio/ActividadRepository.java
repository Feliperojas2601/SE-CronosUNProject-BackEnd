package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Actividad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadRepository extends CrudRepository<Actividad, Integer> {

}