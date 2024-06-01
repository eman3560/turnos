package com.ema.turnos.dao;

import com.ema.turnos.entities.HorariosProfesionales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHorariosProfesionalesDao extends JpaRepository<HorariosProfesionales, Integer> {
    @Query("select c from HorariosProfesionales c where c.descrip like ?1 order by c.descrip")
    public List<HorariosProfesionales> findByDescrip(String name);
}
