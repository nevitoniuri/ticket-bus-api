package com.nevitoniuri.ticketbusapi.resource.response;

import com.nevitoniuri.ticketbusapi.domain.Endereco;
import lombok.Builder;

@Builder
public record RodoviariaResponse(Long id, String nome, Endereco endereco) {
}
