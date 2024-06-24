package com.speedTimerAPI.servicios;

import com.speedTimerAPI.entidades.Intento;

import java.util.List;

public interface IntentoService {
    List<Intento> findAll();
    Intento findById(Long id);
    void deleteById(Long id);
    Intento save(Intento intento);
}
