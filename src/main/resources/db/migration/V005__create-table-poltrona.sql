CREATE TABLE poltronas
(
    id        BIGSERIAL  NOT NULL PRIMARY KEY,
    numero    VARCHAR(5) NOT NULL,
    onibus_id BIGINT     NOT NULL,
    reservada BOOLEAN    NOT NULL DEFAULT FALSE,

    FOREIGN KEY (onibus_id) REFERENCES onibus (id)
);