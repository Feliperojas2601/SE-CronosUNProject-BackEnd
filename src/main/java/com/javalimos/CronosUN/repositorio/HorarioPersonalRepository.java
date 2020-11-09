package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.HorarioPersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HorarioPersonalRepository extends JpaRepository<HorarioPersonal, Integer>, JpaSpecificationExecutor<HorarioPersonal> {

}