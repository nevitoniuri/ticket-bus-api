package com.nevitoniuri.ticketbusapi.service.impl;

import com.nevitoniuri.ticketbusapi.domain.model.Rodoviaria;
import com.nevitoniuri.ticketbusapi.repository.RodoviariaRepository;
import com.nevitoniuri.ticketbusapi.service.RodoviariaService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RodoviariaServiceImpl implements RodoviariaService {

    private final RodoviariaRepository repository;

    @Override
    public Rodoviaria findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Page<Rodoviaria> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void save(Rodoviaria entity) {
        repository.save(entity);
    }
}
