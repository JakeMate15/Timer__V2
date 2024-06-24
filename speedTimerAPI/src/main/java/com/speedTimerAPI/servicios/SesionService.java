package com.speedTimerAPI.servicios;

import com.speedTimerAPI.entidades.Sesion;

import java.util.List;

public interface SesionService {
    List<Sesion> findAll();
    Sesion findById(Long id);
    void deleteById(Long id);
    Sesion save(Sesion sesion);
}
