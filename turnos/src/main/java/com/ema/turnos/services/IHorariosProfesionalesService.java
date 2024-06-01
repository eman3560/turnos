package com.ema.turnos.services;


import com.ema.turnos.entities.HorariosProfesionales;

import java.util.List;

public interface IHorariosProfesionalesService {
    List<HorariosProfesionales> getAll();
    List<HorariosProfesionales> findByDescrip(String descrip);
    HorariosProfesionales get(Integer id);
    void save(HorariosProfesionales entity);
    String delete(HorariosProfesionales entity);
}