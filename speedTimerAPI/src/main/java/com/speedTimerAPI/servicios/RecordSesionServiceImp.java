package com.speedTimerAPI.servicios;

import com.speedTimerAPI.entidades.RecordSesion;
import com.speedTimerAPI.repositorios.RecordSesionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class RecordSesionServiceImp implements RecordSesionService {
    @Autowired
    private RecordSesionRepository recordSesionRepository;

    @Override
    @Transactional(readOnly = true)
    public List<RecordSesion> findAll() {
        return (List<RecordSesion>) recordSesionRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public RecordSesion findById(Long id) {
        Optional<RecordSesion> recordSesion = recordSesionRepository.findById(id);
        return recordSesion.orElse(null);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        recordSesionRepository.deleteById(id);
    }

    @Override
    @Transactional
    public RecordSesion save(RecordSesion recordSesion) {
        return recordSesionRepository.save(recordSesion);
    }
}

