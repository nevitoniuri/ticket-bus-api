CREATE TABLE onibus
(
    id                  BIGSERIAL    NOT NULL PRIMARY KEY,
    placa               VARCHAR(8)   NOT NULL UNIQUE,
    modelo              VARCHAR(100) NOT NULL,
    ano_fabricacao      INTEGER      NOT NULL,
    status              VARCHAR(20)  NOT NULL,
    linha_id            BIGINT       NOT NULL,
    data_hora_cadastro  TIMESTAMP    NOT NULL,
    data_hora_alteracao TIMESTAMP,

    FOREIGN KEY (linha_id) REFERENCES linhas (id)
);