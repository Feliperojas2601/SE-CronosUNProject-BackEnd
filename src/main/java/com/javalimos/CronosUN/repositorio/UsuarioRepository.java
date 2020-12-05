package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
    Optional<Usuario> findByCorreo( String correo );
}