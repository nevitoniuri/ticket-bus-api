package com.nevitoniuri.ticketbusapi.resource.assembler;

import com.nevitoniuri.ticketbusapi.domain.model.Rodoviaria;
import com.nevitoniuri.ticketbusapi.resource.request.RodoviariaCreate;
import com.nevitoniuri.ticketbusapi.resource.response.RodoviariaResponse;
import org.springframework.stereotype.Component;

@Component
public class RodoviariaAssembler implements Assembler<Rodoviaria, RodoviariaCreate, RodoviariaResponse> {

    @Override
    public Rodoviaria toEntity(RodoviariaCreate request) {
        return Rodoviaria.builder()
                .nome(request.nome())
                .endereco(request.endereco())
                .build();
    }

    @Override
    public RodoviariaResponse toResponse(Rodoviaria entity) {
        return RodoviariaResponse.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .endereco(entity.getEndereco())
                .build();
    }
}
