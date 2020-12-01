package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.AsignaturaOpcion;
import com.javalimos.CronosUN.modelo.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface AsignaturaOpcionRepository extends CrudRepository<AsignaturaOpcion, Integer> {
    List<AsignaturaOpcion> findByUsuario(Usuario usuario);
    @Transactional
    void deleteByUsuario(Usuario usuario);
}