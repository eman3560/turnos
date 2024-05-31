package com.ema.turnos.controller;



import com.ema.turnos.entities.Pacientes;
import com.ema.turnos.services.IPacientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PacientesController {
    @Autowired
    IPacientesService entityService;

    @GetMapping(path = "/Pacientes")
    public List<Pacientes> getAll() {return entityService.getAll();}

    @GetMapping(path = "/Pacientes/{id}")
    public Pacientes get(@PathVariable Integer id) {return entityService.get(id);}

    @GetMapping(path = "/Pacientes/search/{expresion}")
    public List<Pacientes> getListPacientes(@PathVariable String expresion) {return entityService.findByApellido(expresion);}

    @PostMapping(value = "/Pacientes", consumes = "application/json", produces = "application/json")
    public Pacientes save(@RequestBody Pacientes entity) {
        entityService.save(entity);
        return entity;
    }

    @GetMapping (path = "/Pacientes/delete/{id}")
    public String delete(@PathVariable Integer id) {
        Pacientes entity = null;
        try {
            entity = entityService.get(id);
            entityService.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }
}
