package com.ema.turnos.servicesimp;


import com.ema.turnos.dao.IProfesionalesDao;
import com.ema.turnos.entities.Profesionales;
import com.ema.turnos.services.IProfesionalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProfesionalesService implements IProfesionalesService {

    @Autowired
    private IProfesionalesDao entityDao;

    public List<Profesionales> getAll() {
        return entityDao.findAll(Sort.by(Sort.Direction.ASC,"apellido"));
    }

    public List<Profesionales> findByApellido(String apellido) {
        return entityDao.findByApellido("%" + apellido + "%");
    }

    public Profesionales get(Integer id) {
        return entityDao.findById(id).orElse(null);
    }

    @Transactional
    public void save(Profesionales entity) {
        entityDao.save(entity);
    }

    @Transactional
    public String delete(Profesionales entity) {
        try {
            entityDao.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }
}
