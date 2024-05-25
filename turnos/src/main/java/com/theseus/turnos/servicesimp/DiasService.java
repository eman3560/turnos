package com.theseus.turnos.servicesimp;


import com.theseus.turnos.dao.IDiasDao;
import com.theseus.turnos.entities.Dias;
import com.theseus.turnos.services.IDiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DiasService implements IDiasService {
    @Autowired
    private IDiasDao entityDao;

    public List<Dias> getAll() {
        return entityDao.findAll(Sort.by(Sort.Direction.ASC,"descrip"));
    }

    public List<Dias> findByDescrip(String descrip) {
        return entityDao.findByDescrip("%" + descrip + "%");
    }

    public Dias get(Integer id) {
        return entityDao.findById(id).orElse(null);
    }

    @Transactional
    public void save(Dias entity) { entityDao.save(entity);
    }

    @Transactional
    public String delete(Dias entity) {
        try {
            entityDao.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }

    }
}