package com.nevitoniuri.ticketbusapi.service.impl;

import com.nevitoniuri.ticketbusapi.domain.model.Linha;
import com.nevitoniuri.ticketbusapi.repository.LinhaRepository;
import com.nevitoniuri.ticketbusapi.service.LinhaService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinhaServiceImpl implements LinhaService {

    private final LinhaRepository repository;

    @Override
    public Linha findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Page<Linha> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void save(Linha entity) {
        repository.save(entity);
    }
}
