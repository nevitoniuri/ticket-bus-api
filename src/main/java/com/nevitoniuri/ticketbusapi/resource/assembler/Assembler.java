package com.nevitoniuri.ticketbusapi.resource.assembler;

/**
 *
 * @param <R> Response
 * @param <I> input
 * @param <E> Entity
 */
public interface Assembler<E, I, R> {

    E toEntity(I request);

    R toResponse(E entity);

}
