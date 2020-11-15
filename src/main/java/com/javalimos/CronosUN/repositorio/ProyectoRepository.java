package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.Proyecto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProyectoRepository extends CrudRepository<Proyecto, Integer> {

    @Query(value = "SELECT * FROM \"proyecto\" WHERE \"pro_usu_id\" = :idUsuario " +
            " AND \"pro_fecha_creacion\" BETWEEN :fechaInicial AND :fechaFinal", nativeQuery = true)
    Iterable<Proyecto> encontrarProyectosFiltrados(@Param("idUsuario") int idUsuario,
                                                   @Param("fechaInicial") Date fechaInicial,
                                                   @Param("fechaFinal") Date fechaFinal);

}