package com.nevitoniuri.ticketbusapi.domain.model;

import com.nevitoniuri.ticketbusapi.domain.enums.StatusBilhete;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "bilhetes")
public class Bilhete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "codigo", nullable = false, unique = true)
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "linha_id", nullable = false)
    private Linha linha;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusBilhete status;

    @ManyToOne
    @JoinColumn(name = "passageiro_id", nullable = false)
    private Passageiro passageiro;

    @ManyToOne
    @JoinColumn(name = "poltrona_id", nullable = false)
    private Poltrona poltrona;

    @Column(name = "data_hora_viagem", nullable = false)
    private LocalDateTime dataHoraViagem;

    @Column(name = "taxa_embarque")
    private BigDecimal taxaEmbarque;

    @Column(name = "desconto")
    private BigDecimal desconto;

    @Column(name = "valor_total", nullable = false)
    private BigDecimal valorTotal;

    @Column(name = "data_hora_compra", nullable = false)
    private LocalDateTime dataHoraCompra = LocalDateTime.now();

    @Column(name = "data_hora_cancelamento")
    private String dataCancelamento;

}
