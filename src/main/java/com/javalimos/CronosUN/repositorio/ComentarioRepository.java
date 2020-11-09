package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ComentarioRepository extends JpaRepository<Comentario, Integer>, JpaSpecificationExecutor<Comentario> {

}