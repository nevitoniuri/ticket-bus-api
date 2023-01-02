package com.nevitoniuri.ticketbusapi.resource.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nevitoniuri.ticketbusapi.domain.Endereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;

@Builder
public record PassageiroCreate(
        @NotBlank
        String nome,
        @NotBlank
        String cpf,
        @Email
        @NotBlank
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        @JsonFormat(pattern = "yyyy-MM-dd")
        String dataNascimento,
        @NotBlank
        @Pattern(regexp = "[MF]")
        String sexo,
        @NotNull
        @Valid
        Endereco endereco) {
}
