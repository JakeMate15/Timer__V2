package com.speedTimerAPI.controladores;

import com.speedTimerAPI.entidades.Intento;
import com.speedTimerAPI.servicios.IntentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/intentos")
public class IntentoController {
    @Autowired
    private IntentoService intentoService;

    @GetMapping
    public List<Intento> findAll() {
        return intentoService.findAll();
    }

    @GetMapping("/{id}")
    public Intento findById(@PathVariable Long id) {
        return intentoService.findById(id);
    }

    @PostMapping
    public Intento save(@RequestBody Intento intento) {
        return intentoService.save(intento);
    }

    @PutMapping("/{id}")
    public Intento update(@PathVariable Long id, @RequestBody Intento intento) {
        intento.setIdIntento(id);
        return intentoService.save(intento);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        intentoService.deleteById(id);
    }
}
