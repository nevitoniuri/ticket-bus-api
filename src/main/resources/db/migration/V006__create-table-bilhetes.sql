CREATE TABLE bilhetes
(
    id                     BIGSERIAL      NOT NULL PRIMARY KEY,
    codigo                 VARCHAR(8)     NOT NULL UNIQUE,
    linha_id               BIGINT         NOT NULL,
    status                 VARCHAR(20)    NOT NULL,
    passageiro_id          BIGINT         NOT NULL,
    poltrona_id            BIGINT         NOT NULL,
    data_hora_viagem       TIMESTAMP      NOT NULL,
    taxa_embarque          DECIMAL(10, 2),
    desconto               DECIMAL(10, 2),
    valor_total            DECIMAL(10, 2) NOT NULL,
    data_hora_compra       TIMESTAMP      NOT NULL,
    data_hora_cancelamento TIMESTAMP,

    FOREIGN KEY (linha_id) REFERENCES linhas (id),
    FOREIGN KEY (passageiro_id) REFERENCES passageiros (id),
    FOREIGN KEY (poltrona_id) REFERENCES poltronas (id)
);