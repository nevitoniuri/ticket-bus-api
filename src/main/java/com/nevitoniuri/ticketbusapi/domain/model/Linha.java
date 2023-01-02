package com.nevitoniuri.ticketbusapi.domain.model;

import com.nevitoniuri.ticketbusapi.domain.enums.StatusLinha;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "linhas")
public class Linha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "codigo", nullable = false, unique = true)
    private String codigo;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusLinha status;

    @ManyToOne
    @JoinColumn(name = "rodoviaria_origem_id", nullable = false)
    private Rodoviaria origem;

    @ManyToOne
    @JoinColumn(name = "rodoviaria_destino_id", nullable = false)
    private Rodoviaria destino;

    @Column(name = "data_hora_saida", nullable = false)
    private LocalDateTime dataHoraSaida;

    @Column(name = "duracao_viagem")
    private Integer duracaoViagem;

    @Column(name = "data_hora_cadastro", nullable = false)
    private LocalDateTime dataHoraCadastro = LocalDateTime.now();

    @Column(name = "data_hora_alteracao")
    private String dataHoraAlteracao;
}
