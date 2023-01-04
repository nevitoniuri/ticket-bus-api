package com.nevitoniuri.ticketbusapi.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "poltronas")
@EqualsAndHashCode(of = "id")
public class Poltrona implements Comparable<Poltrona> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "numero", nullable = false, unique = true)
    private String numero;

    @ManyToOne
    @JoinColumn(name = "onibus_id", nullable = false)
    private Onibus onibus;

    @Column(name = "reservada", nullable = false)
    private boolean reservada = false;

    @Override
    public int compareTo(Poltrona o) {
        return this.numero.compareTo(o.getNumero());
    }

    public void reservar() {
        this.reservada = true;
    }
}
