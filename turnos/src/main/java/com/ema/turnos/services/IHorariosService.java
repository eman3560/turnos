package com.ema.turnos.services;


import com.ema.turnos.entities.Horarios;

import java.util.List;

public interface IHorariosService {
    List<Horarios> getAll();
    List<Horarios> findByDescrip(String descrip);
    Horarios get(Integer id);
    void save(Horarios entity);
    String delete(Horarios entity);
}