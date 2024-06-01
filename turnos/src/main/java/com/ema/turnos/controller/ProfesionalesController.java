package com.ema.turnos.controller;

import com.ema.turnos.entities.Profesionales;
import com.ema.turnos.services.IProfesionalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfesionalesController {
    @Autowired
    IProfesionalesService entityService;

    @GetMapping(path = "/Profesionales")
    public List<Profesionales> getAll() {return entityService.getAll();}

    @GetMapping(path = "/Profesionales/{id}")
    public Profesionales get(@PathVariable Integer id) {return entityService.get(id);}

    @GetMapping(path = "/Profesionales/search/{expresion}")
    public List<Profesionales> getListProfesionales(@PathVariable String expresion) {return entityService.findByApellido(expresion);}

    @PostMapping(value = "/Profesionales", consumes = "application/json", produces = "application/json")
    public Profesionales save(@RequestBody Profesionales entity) {
        entityService.save(entity);
        return entity;
    }

    @GetMapping (path = "/Profesionales/delete/{id}")
    public String delete(@PathVariable Integer id) {
        Profesionales entity = null;
        try {
            entity = entityService.get(id);
            entityService.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }
}
