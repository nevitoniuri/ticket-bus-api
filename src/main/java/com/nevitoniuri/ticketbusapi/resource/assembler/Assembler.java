package com.nevitoniuri.ticketbusapi.resource.assembler;

public interface Assembler<E, I, R> {

    E toEntity(I request);

    R toResponse(E entity);

}
