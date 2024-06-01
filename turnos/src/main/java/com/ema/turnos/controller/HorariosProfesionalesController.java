package com.ema.turnos.controller;


import com.ema.turnos.entities.HorariosProfesionales;
import com.ema.turnos.services.IHorariosProfesionalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HorariosProfesionalesController {

    @Autowired
    IHorariosProfesionalesService entityService;

    @GetMapping(path = "/HorariosProfesionales")
    public List<HorariosProfesionales> getAll() {return entityService.getAll();}

    @GetMapping(path = "/HorariosProfesionales/{id}")
    public HorariosProfesionales get(@PathVariable Integer id) {return entityService.get(id);}

    @GetMapping(path = "/HorariosProfesionales/search/{expresion}")
    public List<HorariosProfesionales> getListHorariosProfesionales(@PathVariable String expresion) {return entityService.findByDescrip(expresion);}

    @PostMapping(value = "/HorariosProfesionales", consumes = "application/json", produces = "application/json")
    public HorariosProfesionales save(@RequestBody HorariosProfesionales entity) {
        entityService.save(entity);
        return entity;
    }

    @GetMapping (path = "/HorariosProfesionales/delete/{id}")
    public String delete(@PathVariable Integer id) {
        HorariosProfesionales entity = null;
        try {
            entity = entityService.get(id);
            entityService.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }

}
