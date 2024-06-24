package com.speedTimerAPI.repositorios;

import com.speedTimerAPI.entidades.Intento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntentoRepository extends CrudRepository<Intento, Long> {
}
