package com.speedTimerAPI.servicios;

import com.speedTimerAPI.entidades.RecordGlobal;

import java.util.List;

public interface RecordGlobalService {
    List<RecordGlobal> findAll();
    RecordGlobal findById(Long id);
    void deleteById(Long id);
    RecordGlobal save(RecordGlobal recordGlobal);
}
