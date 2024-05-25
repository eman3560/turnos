package com.theseus.turnos.dao;

import com.theseus.turnos.entities.Especialidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEspecialidadesDao extends JpaRepository<Especialidades, Integer> {
    @Query("select c from Especialidades c where c.descrip like ?1")
    public List<Especialidades> findByDescrip(String name);
}
