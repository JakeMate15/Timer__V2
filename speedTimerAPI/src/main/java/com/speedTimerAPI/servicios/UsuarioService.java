package com.speedTimerAPI.servicios;

import com.speedTimerAPI.entidades.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> findAll();
    Usuario findById(Long id);
    void deleteById(Long id);
    Usuario save(Usuario usuario);
}