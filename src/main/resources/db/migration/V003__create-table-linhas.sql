CREATE TABLE linhas
(
    id                    BIGSERIAL      NOT NULL PRIMARY KEY,
    codigo                VARCHAR(8)     NOT NULL UNIQUE,
    status                VARCHAR(20)    NOT NULL,
    rodoviaria_origem_id  BIGINT         NOT NULL,
    rodoviaria_destino_id BIGINT         NOT NULL,
    data_hora_saida       TIMESTAMP      NOT NULL,
    valor                 DECIMAL(10, 2) NOT NULL,
    duracao_viagem        INTEGER,
    data_hora_cadastro    TIMESTAMP      NOT NULL,
    data_hora_alteracao   TIMESTAMP,

    FOREIGN KEY (rodoviaria_origem_id) REFERENCES rodoviarias (id),
    FOREIGN KEY (rodoviaria_destino_id) REFERENCES rodoviarias (id)
);