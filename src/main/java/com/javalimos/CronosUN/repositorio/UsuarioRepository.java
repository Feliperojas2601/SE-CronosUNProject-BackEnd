package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
    @Query("SELECT u FROM Usuario u WHERE u.correo = :correo")
    Usuario findUsuarioByCorreo(String correo);
}