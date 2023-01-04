CREATE TABLE rodoviarias
(
    id          BIGSERIAL    NOT NULL PRIMARY KEY,
    nome        VARCHAR(100) NOT NULL UNIQUE,
    logradouro  VARCHAR(100) NOT NULL,
    numero      VARCHAR(20)  NOT NULL,
    complemento VARCHAR(100),
    bairro      VARCHAR(100) NOT NULL,
    cidade      VARCHAR(100) NOT NULL,
    uf          VARCHAR(2)   NOT NULL,
    cep         VARCHAR(8)   NOT NULL
);