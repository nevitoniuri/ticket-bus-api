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
import com.nevitoniuri.ticketbusapi.service.BilheteService;
import com.nevitoniuri.ticketbusapi.service.LinhaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class BilheteAssembler implements Assembler<Bilhete, BilheteCreate, BilheteResponse> {

    private final LinhaService linhaService;

    @Override
    public Bilhete toEntity(BilheteCreate request) {

        var linha = linhaService.findById(Long.parseLong(request.linhaId()));

        return Bilhete.builder()
                .codigo(request.codigo())
                .linha(linha)
                .status(StatusBilhete.EMITIDO)
                .passageiro(Passageiro.builder().id(Long.parseLong(request.passageiroId())).build())
                .poltrona(Poltrona.builder().id(Long.parseLong(request.poltronaId())).build())
                .dataHoraViagem(DateUtil.handleDataHora(request.dataHoraViagem()))
                .taxaEmbarque(Constantes.TAXA_EMBARQUE)
                .valorTotal(calcularValorTotal(linha.getValor(), Constantes.TAXA_EMBARQUE,
                        BigDecimal.valueOf(0)))
                .dataHoraCompra(LocalDateTime.now())
                .build();
    }

    public BigDecimal calcularValorTotal(BigDecimal valorLinha, BigDecimal taxaEmbarque, BigDecimal desconto) {
        return valorLinha.add(taxaEmbarque).subtract(desconto);
    }

    @Override
    public BilheteResponse toResponse(Bilhete entity) {
        return null;
    }
}
