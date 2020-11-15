package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.HorarioPersonal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioPersonalRepository extends CrudRepository<HorarioPersonal, Integer> {

}