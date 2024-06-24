package com.speedTimerAPI.servicios;

import com.speedTimerAPI.entidades.Categoria;

import java.util.List;

public interface CategoriaService {
    List<Categoria> findAll();
    Categoria findById(Long id);
    void deleteById(Long id);
    Categoria save(Categoria categoria);
}
