package com.ema.turnos.controller;


import com.ema.turnos.entities.Horarios;
import com.ema.turnos.services.IHorariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HorariosController {

    @Autowired
    IHorariosService entityService;

    @GetMapping(path = "/horarios")
    public List<Horarios> getAll() {return entityService.getAll();}

    @GetMapping(path = "/horarios/{id}")
    public Horarios get(@PathVariable Integer id) {return entityService.get(id);}

    @GetMapping(path = "/horarios/search/{expresion}")
    public List<Horarios> getListHorarios(@PathVariable String expresion) {return entityService.findByDescrip(expresion);}

    @PostMapping(value = "/horarios", consumes = "application/json", produces = "application/json")
    public Horarios save(@RequestBody Horarios entity) {
        entityService.save(entity);
        return entity;
    }

    @GetMapping (path = "/horarios/delete/{id}")
    public String delete(@PathVariable Integer id) {
        Horarios entity = null;
         try {
             entity = entityService.get(id);
             entityService.delete(entity);
             return null;
         } catch (Exception e) {
             return e.getMessage().toString();
         }
    }

}
