package com.ema.turnos.servicesimp;



import com.ema.turnos.services.IDiasHorariosTurnosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DiasHorariosTurnos implements IDiasHorariosTurnosService {
    @Autowired
    private IDiasHorariosTurnosService entityDao;

    public List<IDiasHorariosTurnosService> getAll()
    {
        return entityDao.findAll(Sort.by(Sort.Direction.ASC,"id"));
    }

    public IDiasHorariosTurnosService get(Integer id) {
        return entityDao.findById(id).orElse(null);
    }



    @Transactional
    public void save(DiasHorariosTurnos entity)
    {
        //para evitar que se cargue 2 veces un mismo horario se crea un ID en forma manual concatenando el ID del dia y el ID del horario.
        //Así se evita cargar 2 veces 8:00AM
        entity.setId(Long.parseLong(entity.getDia().getId().toString()+entity.getHora().getId().toString()));
        entityDao.save(entity);
    }

    @Transactional
    public String delete(DiasHorariosTurnos entity) {
        try {
            entityDao.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }

    }
}