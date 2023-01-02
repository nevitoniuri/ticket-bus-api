package com.nevitoniuri.ticketbusapi.service.assembler;

import org.springframework.data.domain.Page;

public interface Assembler <E, I, U, D> {

    E toEntity(I input);

    void updateEntity(U update, E entity);

    D toDTO(E entity);

    Page<D> toDTO(Page<E> entities);

}
