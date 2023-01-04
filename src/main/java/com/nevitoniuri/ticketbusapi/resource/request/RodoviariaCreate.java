package com.nevitoniuri.ticketbusapi.resource.request;

import com.nevitoniuri.ticketbusapi.domain.Endereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record RodoviariaCreate(
        @NotBlank
        String nome,
        @Valid
        @NotNull
        Endereco endereco) {
}
