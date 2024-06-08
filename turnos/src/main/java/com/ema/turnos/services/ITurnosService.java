package com.ema.turnos.services;


import com.ema.turnos.entities.Turnos;

import java.util.List;

public interface ITurnosService {
    List<Turnos> getAll();
    Turnos get(String id);
    void save(Turnos entity);
    String delete(Turnos entity);
}
