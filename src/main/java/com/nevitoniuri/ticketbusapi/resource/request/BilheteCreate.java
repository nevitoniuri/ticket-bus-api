package com.nevitoniuri.ticketbusapi.resource.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record BilheteCreate(

        @NotBlank
        String codigo,

        @NotBlank
        String linhaId,

        @NotBlank
        String passageiroId,

        @NotBlank
        String poltronaId,

        @NotBlank
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
        String dataHoraViagem
) {
}
