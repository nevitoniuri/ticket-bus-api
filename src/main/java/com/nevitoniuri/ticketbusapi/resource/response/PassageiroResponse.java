package com.nevitoniuri.ticketbusapi.resource.response;

import com.nevitoniuri.ticketbusapi.domain.Endereco;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record PassageiroResponse(Long id, String nome, String cpf, String email, String telefone,
                                 LocalDateTime dataNascimento, String sexo, LocalDateTime dataCadastro,
                                 LocalDateTime dataAlteracao, Endereco endereco) {
}
