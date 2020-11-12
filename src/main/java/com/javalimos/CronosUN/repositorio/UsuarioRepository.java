package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>,
        JpaSpecificationExecutor<Usuario> {

}