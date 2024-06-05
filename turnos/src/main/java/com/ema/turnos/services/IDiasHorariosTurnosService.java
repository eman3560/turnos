package com.ema.turnos.services;


import com.ema.turnos.entities.DiasHorariosTurnos;

import java.util.List;

public interface IDiasHorariosTurnosService {
    List<DiasHorariosTurnos> getAll();
    List<DiasHorariosTurnos> findByEstado (Boolean estado);
    DiasHorariosTurnos get(Integer id);
    void save(DiasHorariosTurnos entity);
    String delete(DiasHorariosTurnos entity);
}