package com.ema.turnos.services;



import com.ema.turnos.entities.Pacientes;

import java.util.List;

public interface IPacientesService {
    List<Pacientes> getAll();
    List<Pacientes> findByApellido (String apellido);
    Pacientes get(Integer id);
    void save(Pacientes entity);
    String delete(Pacientes entity);
}
