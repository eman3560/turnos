package com.ema.turnos.servicesimp;


import com.ema.turnos.dao.IHorariosProfesionalesDao;
import com.ema.turnos.entities.HorariosProfesionales;
import com.ema.turnos.services.IHorariosProfesionalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HorariosProfesionalesService implements IHorariosProfesionalesService {
    @Autowired
    private IHorariosProfesionalesDao entityDao;

    public List<HorariosProfesionales> getAll() {
        return entityDao.findAll(Sort.by(Sort.Direction.ASC,"descrip"));
    }

    public List<HorariosProfesionales> findByDescrip(String descrip) {
        return entityDao.findByDescrip("%" + descrip + "%");
    }

    public HorariosProfesionales get(Integer id) {
        return entityDao.findById(id).orElse(null);
    }

    @Transactional
    public void save(HorariosProfesionales entity) { entityDao.save(entity);
    }

    @Transactional
    public String delete(HorariosProfesionales entity) {
        try {
            entityDao.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }

    }
}