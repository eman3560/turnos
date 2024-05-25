package com.theseus.turnos.servicesimp;



import com.theseus.turnos.dao.ITiposDocDao;
import com.theseus.turnos.entities.TiposDoc;
import com.theseus.turnos.services.ITiposDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TiposDocService implements ITiposDocService {
    @Autowired
    private ITiposDocDao entityDao;

    public List<TiposDoc> getAll() {
        return entityDao.findAll(Sort.by(Sort.Direction.ASC,"descrip"));
    }

    public List<TiposDoc> findByDescrip(String descrip) {
        return entityDao.findByDescrip("%" + descrip + "%");
    }

    public TiposDoc get(Integer id) {
        return entityDao.findById(id).orElse(null);
    }

    @Transactional
    public void save(TiposDoc entity) {
        entityDao.save(entity);
    }

    @Transactional
    public String delete(TiposDoc entity) {
        try {
            entityDao.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }
}
