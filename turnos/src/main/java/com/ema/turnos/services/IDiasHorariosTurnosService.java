package com.ema.turnos.services;


import com.ema.turnos.entities.DiasHorariosTurnos;

import java.util.List;

public interface IDiasHorariosTurnosService {
    List<DiasHorariosTurnos> getAll();
    DiasHorariosTurnos get(Long id);
    void save(DiasHorariosTurnos entity);
    String delete(DiasHorariosTurnos entity);
}