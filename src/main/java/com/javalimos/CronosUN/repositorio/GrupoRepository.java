package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Grupo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository extends CrudRepository<Grupo, Integer> {

}