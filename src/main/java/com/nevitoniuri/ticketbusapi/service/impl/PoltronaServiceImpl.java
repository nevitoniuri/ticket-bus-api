package com.nevitoniuri.ticketbusapi.service.impl;

import com.nevitoniuri.ticketbusapi.domain.model.Poltrona;
import com.nevitoniuri.ticketbusapi.repository.PoltronaRepository;
import com.nevitoniuri.ticketbusapi.service.PoltronaService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PoltronaServiceImpl implements PoltronaService {

    private final PoltronaRepository repository;

    @Override
    public Poltrona findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Page<Poltrona> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void save(Poltrona entity) {
        repository.save(entity);
    }
}
