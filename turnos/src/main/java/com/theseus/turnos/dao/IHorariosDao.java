package com.theseus.turnos.dao;


import com.theseus.turnos.entities.Horarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHorariosDao extends JpaRepository<Horarios, Integer> {
    @Query("select c from Horarios c where c.descrip like ?1 order by c.descrip")
    public List<Horarios> findByDescrip(String name);
}
