package com.ema.turnos.controller;


import com.ema.turnos.entities.Especialidades;
import com.ema.turnos.services.IEspecialidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EspecialidadesController {

    @Autowired
    IEspecialidadesService entityService;

    @GetMapping(path = "/especialidades")
    public List<Especialidades> getAll() {return entityService.getAll();}

    @GetMapping(path = "/especialidades/{id}")
    public Especialidades get(@PathVariable Integer id) {return entityService.get(id);}

    @GetMapping(path = "/especialidades/search/{expresion}")
    public List<Especialidades> getListEspecialidades(@PathVariable String expresion) {return entityService.findByDescrip(expresion);}

    @PostMapping(value = "/especialidades", consumes = "application/json", produces = "application/json")
    public Especialidades save(@RequestBody Especialidades entity) {
        entityService.save(entity);
        return entity;
    }

    @GetMapping (path = "/especialidades/delete/{id}")
    public String delete(@PathVariable Integer id) {
        Especialidades entity = null;
         try {
             entity = entityService.get(id);
             entityService.delete(entity);
             return null;
         } catch (Exception e) {
             return e.getMessage().toString();
         }
    }

}
