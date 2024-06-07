package com.ema.turnos.controller;


import com.ema.turnos.entities.DiasHorariosTurnos;
import com.ema.turnos.services.IDiasHorariosTurnosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DiasHorariosTurnosController {

    @Autowired
    IDiasHorariosTurnosService entityService;

    @GetMapping(path = "/horariosturnos")
    public List<DiasHorariosTurnos> getAll() {return entityService.getAll();}

    @GetMapping(path = "/horariosturnos/{id}")
    public DiasHorariosTurnos get(@PathVariable Long id) {return entityService.get(id);}

    @PostMapping(value = "/horariosturnos", consumes = "application/json", produces = "application/json")
    public DiasHorariosTurnos save(@RequestBody DiasHorariosTurnos entity) {
        entityService.save(entity);
        return entity;
    }

    @GetMapping (path = "/horariosturnos/delete/{id}")
    public String delete(@PathVariable Long id) {
        DiasHorariosTurnos entity = null;
        try {
            entity = entityService.get(id);
            entityService.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }

}

