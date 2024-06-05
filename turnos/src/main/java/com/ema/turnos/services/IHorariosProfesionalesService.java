package com.ema.turnos.services;


import com.ema.turnos.entities.HorariosProfesionales;

import java.util.List;

public interface IHorariosProfesionalesService {
    List<HorariosProfesionales> getAll();
    HorariosProfesionales get(Integer id);
    void save(HorariosProfesionales entity);
    String delete(HorariosProfesionales entity);
}