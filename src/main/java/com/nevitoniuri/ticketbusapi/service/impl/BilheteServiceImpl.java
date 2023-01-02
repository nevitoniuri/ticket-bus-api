package com.nevitoniuri.ticketbusapi.service.impl;

import com.nevitoniuri.ticketbusapi.domain.model.Bilhete;
import com.nevitoniuri.ticketbusapi.repository.BilheteRepository;
import com.nevitoniuri.ticketbusapi.service.BilheteService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BilheteServiceImpl implements BilheteService {

    private final BilheteRepository repository;

    @Override
    public Bilhete findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Page<Bilhete> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void save(Bilhete entity) {
        repository.save(entity);
    }
}
