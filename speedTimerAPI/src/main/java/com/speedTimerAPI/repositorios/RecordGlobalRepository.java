package com.speedTimerAPI.repositorios;

import com.speedTimerAPI.entidades.RecordGlobal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordGlobalRepository extends CrudRepository<RecordGlobal, Long> {
}
