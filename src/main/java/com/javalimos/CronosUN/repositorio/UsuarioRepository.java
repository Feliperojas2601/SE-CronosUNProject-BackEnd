package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Usuario;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    Usuario findByAlias(String alias);
    Usuario findByCorreo(String Correo);
    boolean existsByCorreo(String Correo);
}
