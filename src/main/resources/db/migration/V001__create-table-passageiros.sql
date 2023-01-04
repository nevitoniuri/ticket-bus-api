CREATE TABLE passageiros
(
    id              BIGSERIAL    NOT NULL PRIMARY KEY,
    nome            VARCHAR(100) NOT NULL,
    cpf             VARCHAR(11)  NOT NULL UNIQUE,
    email           VARCHAR(100) NOT NULL UNIQUE,
    telefone        VARCHAR(11)  NOT NULL UNIQUE,
    data_nascimento TIMESTAMP    NOT NULL,
    sexo            VARCHAR(1),
    data_cadastro   TIMESTAMP    NOT NULL,
    data_alteracao  TIMESTAMP,
    logradouro      VARCHAR(100) NOT NULL,
    numero          VARCHAR(20)  NOT NULL,
    complemento     VARCHAR(100),
    bairro          VARCHAR(100) NOT NULL,
    cidade          VARCHAR(100) NOT NULL,
    uf              VARCHAR(2)   NOT NULL,
    cep             VARCHAR(8)   NOT NULL
);