package com.nevitoniuri.ticketbusapi.resource.assembler;

import com.nevitoniuri.ticketbusapi.common.DateUtil;
import com.nevitoniuri.ticketbusapi.domain.model.Passageiro;
import com.nevitoniuri.ticketbusapi.resource.request.PassageiroCreate;
import com.nevitoniuri.ticketbusapi.resource.response.PassageiroResponse;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PassageiroAssembler implements Assembler<Passageiro, PassageiroCreate, PassageiroResponse>{
    @Override
    public Passageiro toEntity(PassageiroCreate request) {
        return Passageiro.builder()
                .nome(request.nome())
                .cpf(request.cpf())
                .email(request.email())
                .telefone(request.telefone())
                .dataNascimento(DateUtil.handleData(request.dataNascimento()))
                .sexo(request.sexo())
                .dataCadastro(LocalDateTime.now())
                .endereco(request.endereco())
                .build();
    }

    @Override
    public PassageiroResponse toResponse(Passageiro entity) {
        return PassageiroResponse.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .cpf(entity.getCpf())
                .email(entity.getEmail())
                .telefone(entity.getTelefone())
                .dataNascimento(entity.getDataNascimento())
                .sexo(entity.getSexo())
                .dataCadastro(entity.getDataCadastro())
                .dataAlteracao(entity.getDataAlteracao())
                .endereco(entity.getEndereco())
                .build();
    }
}
