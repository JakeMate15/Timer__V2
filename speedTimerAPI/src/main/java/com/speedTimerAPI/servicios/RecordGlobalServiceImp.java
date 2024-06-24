package com.speedTimerAPI.servicios;

import com.speedTimerAPI.entidades.RecordGlobal;
import com.speedTimerAPI.repositorios.RecordGlobalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RecordGlobalServiceImp implements RecordGlobalService {
    @Autowired
    private RecordGlobalRepository recordGlobalRepository;

    @Override
    @Transactional(readOnly = true)
    public List<RecordGlobal> findAll() {
        return (List<RecordGlobal>) recordGlobalRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public RecordGlobal findById(Long id) {
        Optional<RecordGlobal> recordGlobal = recordGlobalRepository.findById(id);
        return recordGlobal.orElse(null);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        recordGlobalRepository.deleteById(id);
    }

    @Override
    @Transactional
    public RecordGlobal save(RecordGlobal recordGlobal) {
        return recordGlobalRepository.save(recordGlobal);
    }
}

