package com.ema.turnos.dao;

import com.ema.turnos.entities.Profesionales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProfesionalesDao extends JpaRepository<Profesionales, Integer> {
    @Query("select c from Profesionales c where c.apellido like ?1")
    public List<Profesionales> findByApellido (String apellido);
}