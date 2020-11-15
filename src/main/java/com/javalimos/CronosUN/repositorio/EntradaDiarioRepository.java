package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.EntradaDiario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntradaDiarioRepository extends CrudRepository<EntradaDiario, Integer> {

}