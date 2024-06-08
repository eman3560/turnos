package com.ema.turnos.controller;

import com.ema.turnos.entities.Turnos;
import com.ema.turnos.services.ITurnosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
 @RestController
 @RequestMapping("/api")
 public class TurnosController {

        @Autowired
        ITurnosService entityService;

        @GetMapping(path = "/Turnos")
        public List<Turnos> getAll() {return entityService.getAll();}

        @GetMapping(path = "/Turnos/{id}")
        public Turnos get(@PathVariable String id) {return entityService.get(id);}

        @PostMapping(value = "/Turnos", consumes = "application/json", produces = "application/json")
        public Turnos save(@RequestBody Turnos entity) {
            entityService.save(entity);
            return entity;
        }

        @GetMapping (path = "/Turnos/delete/{id}")
        public String delete(@PathVariable String id) {
            Turnos entity = null;
            try {
                entity = entityService.get(id);
                entityService.delete(entity);
                return null;
            } catch (Exception e) {
                return e.getMessage().toString();
            }
        }
}
