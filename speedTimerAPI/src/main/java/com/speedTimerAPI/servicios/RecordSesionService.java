package com.speedTimerAPI.servicios;

import com.speedTimerAPI.entidades.RecordSesion;

import java.util.List;

public interface RecordSesionService {
    List<RecordSesion> findAll();
    RecordSesion findById(Long id);
    void deleteById(Long id);
    RecordSesion save(RecordSesion recordSesion);
}