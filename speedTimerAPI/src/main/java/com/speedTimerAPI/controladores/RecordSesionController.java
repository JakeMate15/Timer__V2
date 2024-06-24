package com.speedTimerAPI.controladores;

import com.speedTimerAPI.entidades.RecordSesion;
import com.speedTimerAPI.servicios.RecordSesionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/records-sesion")
public class RecordSesionController {
    @Autowired
    private RecordSesionService recordSesionService;

    @GetMapping
    public List<RecordSesion> findAll() {
        return recordSesionService.findAll();
    }

    @GetMapping("/{id}")
    public RecordSesion findById(@PathVariable Long id) {
        return recordSesionService.findById(id);
    }

    @PostMapping
    public RecordSesion save(@RequestBody RecordSesion recordSesion) {
        return recordSesionService.save(recordSesion);
    }

    @PutMapping("/{id}")
    public RecordSesion update(@PathVariable Long id, @RequestBody RecordSesion recordSesion) {
        recordSesion.setIdRecordSesion(id);
        return recordSesionService.save(recordSesion);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        recordSesionService.deleteById(id);
    }
}
