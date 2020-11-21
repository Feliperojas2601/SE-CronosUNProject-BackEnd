package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.AsignaturaOpcion;
import com.javalimos.CronosUN.modelo.HorarioInscripcion;
import com.javalimos.CronosUN.modelo.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HorarioInscripcionRepository extends CrudRepository<HorarioInscripcion, Integer> {
    @Query("SELECT ao FROM AsignaturaOpcion ao WHERE ao.usuario = :usuario")
    List<AsignaturaOpcion> findAsignaturaOpcionByUsuario(Usuario usuario);
}