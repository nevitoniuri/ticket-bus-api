package com.nevitoniuri.ticketbusapi.domain;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Builder
public class Endereco {
    @NotBlank
    private String logradouro;
    @NotBlank
    @Pattern(regexp = "\\d{1,10}")
    private String numero;
    private String complemento;
    @NotBlank
    private String bairro;
    @NotBlank
    private String cidade;
    @NotBlank
    private String uf;
    @NotBlank
    @Pattern(regexp = "\\d{8}")
    private String cep;
}
