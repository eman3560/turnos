package com.ema.turnos.servicesimp;


import com.ema.turnos.dao.IPacientesDao;
import com.ema.turnos.entities.Pacientes;
import com.ema.turnos.services.IPacientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PacientesService implements IPacientesService {

    @Autowired
    private IPacientesDao entityDao;

    public List<Pacientes> getAll() {
        return entityDao.findAll(Sort.by(Sort.Direction.ASC,"apellido"));
    }

    public List<Pacientes> findByApellido(String apellido) {
        return entityDao.findByApellido("%" + apellido + "%");
    }

    public Pacientes get(Integer id) {
        return entityDao.findById(id).orElse(null);
    }

    @Transactional
    public void save(Pacientes entity) {
        entityDao.save(entity);
    }

    @Transactional
    public String delete(Pacientes entity) {
        try {
            entityDao.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }
}
