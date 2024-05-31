package com.ema.turnos.dao;


import com.ema.turnos.entities.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPacientesDao extends JpaRepository<Pacientes, Integer> {
    @Query("select c from Pacientes c where c.apellido like ?1")
    public List<Pacientes> findByApellido (String apellido);
}
