package com.ema.turnos.dao;

import com.ema.turnos.entities.HorariosProfesionales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHorariosProfesionalesDao extends JpaRepository<HorariosProfesionales, Integer> {

}
