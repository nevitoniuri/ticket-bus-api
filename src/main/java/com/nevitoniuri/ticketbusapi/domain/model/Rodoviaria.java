package com.nevitoniuri.ticketbusapi.domain.model;

import com.nevitoniuri.ticketbusapi.domain.Endereco;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "rodoviarias")
public class Rodoviaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "nome", nullable = false, unique = true)
    private String nome;

    @Embedded
    private Endereco endereco;
}
