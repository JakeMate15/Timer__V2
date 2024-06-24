package com.speedTimerAPI.repositorios;

import com.speedTimerAPI.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
