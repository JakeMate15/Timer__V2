package com.speedTimerAPI.controladores;

import com.speedTimerAPI.entidades.RecordGlobal;
import com.speedTimerAPI.servicios.RecordGlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/records-globales")
public class RecordGlobalController {
    @Autowired
    private RecordGlobalService recordGlobalService;

    @GetMapping
    public List<RecordGlobal> findAll() {
        return recordGlobalService.findAll();
    }

    @GetMapping("/{id}")
    public RecordGlobal findById(@PathVariable Long id) {
        return recordGlobalService.findById(id);
    }

    @PostMapping
    public RecordGlobal save(@RequestBody RecordGlobal recordGlobal) {
        return recordGlobalService.save(recordGlobal);
    }

    @PutMapping("/{id}")
    public RecordGlobal update(@PathVariable Long id, @RequestBody RecordGlobal recordGlobal) {
        recordGlobal.setIdRecordGlobal(id);
        return recordGlobalService.save(recordGlobal);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        recordGlobalService.deleteById(id);
    }
}
