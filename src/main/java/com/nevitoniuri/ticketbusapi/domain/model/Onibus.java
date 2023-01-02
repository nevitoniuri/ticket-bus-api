package com.nevitoniuri.ticketbusapi.domain.model;

import com.nevitoniuri.ticketbusapi.domain.enums.StatusOnibus;
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
@Table(name = "onibus")
public class Onibus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "placa", nullable = false, unique = true)
    private String placa;

    @Column(name = "modelo", nullable = false)
    private String modelo;

    @Column(name = "ano_fabricacao", nullable = false)
    private Integer anoFabricacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusOnibus status;

    @ManyToOne
    @JoinColumn(name = "linha_id", nullable = false, unique = true)
    private Linha linha;

    @Column(name = "data_hora_cadastro", nullable = false)
    private LocalDateTime dataHoraCadastro = LocalDateTime.now();

    @Column(name = "data_hora_alteracao")
    private LocalDateTime dataHoraAlteracao;
}
