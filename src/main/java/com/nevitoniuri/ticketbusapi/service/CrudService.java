package com.nevitoniuri.ticketbusapi.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CrudService<E> {

    E findById(Long id);

    Page<E> list(Pageable pageable);

    void save(E entity);

}
