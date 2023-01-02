package com.nevitoniuri.ticketbusapi.service.impl;

import com.nevitoniuri.ticketbusapi.domain.model.Passageiro;
import com.nevitoniuri.ticketbusapi.repository.PassageiroRepository;
import com.nevitoniuri.ticketbusapi.service.PassageiroService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PassageiroServiceImpl implements PassageiroService {

    private final PassageiroRepository repository;

    @Override
    public Passageiro findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Page<Passageiro> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void save(Passageiro entity) {
        repository.save(entity);
    }

}
