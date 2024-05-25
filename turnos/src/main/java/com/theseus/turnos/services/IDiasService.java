package com.theseus.turnos.services;


import com.theseus.turnos.entities.Dias;

import java.util.List;

public interface IDiasService {
    List<Dias> getAll();
    List<Dias> findByDescrip(String descrip);
    Dias get(Integer id);
    void save(Dias entity);
    String delete(Dias entity);
}