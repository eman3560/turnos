package com.ema.turnos.dao;


import com.ema.turnos.entities.Horarios;
import com.ema.turnos.entities.Turnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITurnosDao extends JpaRepository<Turnos, String> {

}
