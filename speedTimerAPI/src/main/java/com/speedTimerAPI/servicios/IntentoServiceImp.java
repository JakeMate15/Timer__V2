package com.speedTimerAPI.servicios;

import com.speedTimerAPI.entidades.Intento;
import com.speedTimerAPI.repositorios.IntentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class IntentoServiceImp implements IntentoService {
    @Autowired
    private IntentoRepository intentoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Intento> findAll() {
        return (List<Intento>) intentoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Intento findById(Long id) {
        Optional<Intento> intento = intentoRepository.findById(id);
        return intento.orElse(null);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        intentoRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Intento save(Intento intento) {
        return intentoRepository.save(intento);
    }
}

