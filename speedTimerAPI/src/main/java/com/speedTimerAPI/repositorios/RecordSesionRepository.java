package com.speedTimerAPI.repositorios;

import com.speedTimerAPI.entidades.RecordSesion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordSesionRepository extends CrudRepository<RecordSesion, Long> {
}
