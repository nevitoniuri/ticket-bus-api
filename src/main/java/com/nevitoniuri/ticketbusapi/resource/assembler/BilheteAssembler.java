package com.nevitoniuri.ticketbusapi.resource.assembler;

import com.nevitoniuri.ticketbusapi.common.Constantes;
import com.nevitoniuri.ticketbusapi.common.DateUtil;
import com.nevitoniuri.ticketbusapi.domain.enums.StatusBilhete;
import com.nevitoniuri.ticketbusapi.domain.model.Bilhete;
import com.nevitoniuri.ticketbusapi.domain.model.Linha;
import com.nevitoniuri.ticketbusapi.domain.model.Passageiro;
import com.nevitoniuri.ticketbusapi.domain.model.Poltrona;
import com.nevitoniuri.ticketbusapi.resource.request.BilheteCreate;
import com.nevitoniuri.ticketbusapi.resource.response.BilheteResponse;

import java.time.LocalDateTime;

public class BilheteAssembler implements Assembler<Bilhete, BilheteCreate, BilheteResponse> {


    @Override
    public Bilhete toEntity(BilheteCreate request) {
        return Bilhete.builder()
                .codigo(request.codigo())
                .linha(Linha.builder().id(Long.parseLong(request.linhaId())).build())
                .status(StatusBilhete.EMITIDO)
                .passageiro(Passageiro.builder().id(Long.parseLong(request.passageiroId())).build())
                .poltrona(Poltrona.builder().id(Long.parseLong(request.poltronaId())).build())
                .dataHoraViagem(DateUtil.handleDataHora(request.dataHoraViagem()))
                .taxaEmbarque(Constantes.TAXA_EMBARQUE)
                .desconto(null)
                .valorTotal(null)
                .dataHoraCompra(LocalDateTime.now())
                .build();
    }

    @Override
    public BilheteResponse toResponse(Bilhete entity) {
        return null;
    }
}
