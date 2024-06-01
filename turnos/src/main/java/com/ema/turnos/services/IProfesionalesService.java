package com.ema.turnos.services;

import com.ema.turnos.entities.Profesionales;

import java.util.List;

public interface IProfesionalesService {
    List<Profesionales> getAll();
    List<Profesionales> findByApellido (String apellido);
    Profesionales get(Integer id);
    void save(Profesionales entity);
    String delete(Profesionales entity);
}
