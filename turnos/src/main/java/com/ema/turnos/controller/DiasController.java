package com.ema.turnos.controller;


import com.ema.turnos.entities.Dias;
import com.ema.turnos.services.IDiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DiasController {

    @Autowired
    IDiasService entityService;

    @GetMapping(path = "/dias")
    public List<Dias> getAll() {return entityService.getAll();}

    @GetMapping(path = "/dias/{id}")
    public Dias get(@PathVariable Integer id) {return entityService.get(id);}

    @GetMapping(path = "/dias/search/{expresion}")
    public List<Dias> getListDias(@PathVariable String expresion) {return entityService.findByDescrip(expresion);}

    @PostMapping(value = "/dias", consumes = "application/json", produces = "application/json")
    public Dias save(@RequestBody Dias entity) {
        entityService.save(entity);
        return entity;
    }

    @GetMapping (path = "/dias/delete/{id}")
    public String delete(@PathVariable Integer id) {
        Dias entity = null;
         try {
             entity = entityService.get(id);
             entityService.delete(entity);
             return null;
         } catch (Exception e) {
             return e.getMessage().toString();
         }
    }

}
