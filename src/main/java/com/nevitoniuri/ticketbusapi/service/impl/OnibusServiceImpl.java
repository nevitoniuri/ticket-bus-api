package com.nevitoniuri.ticketbusapi.service.impl;

import com.nevitoniuri.ticketbusapi.domain.model.Onibus;
import com.nevitoniuri.ticketbusapi.repository.OnibusRepository;
import com.nevitoniuri.ticketbusapi.service.OnibusService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OnibusServiceImpl implements OnibusService {

    private final OnibusRepository repository;

    @Override
    public Onibus findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Page<Onibus> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void save(Onibus entity) {
        repository.save(entity);
    }
}
