create table passageiros
(
    id              bigint       not null,
    nome            varchar(100) not null,
    cpf             varchar(11)  not null,
    email           varchar(100) not null,
    telefone        varchar(11)  not null,
    data_nascimento timestamp    not null,
    sexo            varchar(1),
    data_cadastro   timestamp    not null,
    data_alteracao  timestamp,
    logradouro      varchar(100) not null,
    numero          varchar(20)  not null,
    complemento     varchar(100),
    bairro          varchar(100) not null,
    cidade          varchar(100) not null,
    uf              varchar(2)   not null,
    cep             varchar(8)   not null,

    constraint passageiros_pk primary key (id),
    constraint passageiros_unique_cpf unique (cpf),
    constraint passageiros_unique_email unique (email),
    constraint passageiros_unique_telefone unique (telefone)
);

create sequence if not exists passageiros_id_seq;

alter table passageiros
    alter column id set default nextval('passageiros_id_seq');