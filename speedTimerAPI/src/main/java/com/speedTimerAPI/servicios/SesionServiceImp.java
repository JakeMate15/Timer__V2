package com.speedTimerAPI.servicios;

import com.speedTimerAPI.entidades.Sesion;
import com.speedTimerAPI.repositorios.SesionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SesionServiceImp implements SesionService {
    @Autowired
    private SesionRepository sesionRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Sesion> findAll() {
        return (List<Sesion>) sesionRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Sesion findById(Long id) {
        Optional<Sesion> sesion = sesionRepository.findById(id);
        return sesion.orElse(null);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        sesionRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Sesion save(Sesion sesion) {
        return sesionRepository.save(sesion);
    }
}
