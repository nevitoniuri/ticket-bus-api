package com.nevitoniuri.ticketbusapi.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "poltronas")
@EqualsAndHashCode(of = "numeroPoltrona", callSuper = false)
public class Poltrona implements Comparable<Poltrona> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "numero", nullable = false, unique = true)
    private String numero;

    @Column(name = "valor", nullable = false)
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "onibus_id", nullable = false)
    private Onibus onibus;

    private boolean reservada = false;

    @Override
    public int compareTo(Poltrona o) {
        return this.numero.compareTo(o.getNumero());
    }

    public void reservar() {
        this.reservada = true;
    }
}
