package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Comentario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends CrudRepository<Comentario, Integer> {

}