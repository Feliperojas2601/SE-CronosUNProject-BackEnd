package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>,
        JpaSpecificationExecutor<Usuario> {
}