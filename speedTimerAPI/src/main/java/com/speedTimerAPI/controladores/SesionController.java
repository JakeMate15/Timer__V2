package com.speedTimerAPI.controladores;

import com.speedTimerAPI.entidades.Sesion;
import com.speedTimerAPI.servicios.SesionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sesiones")
public class SesionController {
    @Autowired
    private SesionService sesionService;

    @GetMapping
    public List<Sesion> findAll() {
        return sesionService.findAll();
    }

    @GetMapping("/{id}")
    public Sesion findById(@PathVariable Long id) {
        return sesionService.findById(id);
    }

    @PostMapping
    public Sesion save(@RequestBody Sesion sesion) {
        return sesionService.save(sesion);
    }

    @PutMapping("/{id}")
    public Sesion update(@PathVariable Long id, @RequestBody Sesion sesion) {
        sesion.setIdSesion(id);
        return sesionService.save(sesion);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        sesionService.deleteById(id);
    }
}
