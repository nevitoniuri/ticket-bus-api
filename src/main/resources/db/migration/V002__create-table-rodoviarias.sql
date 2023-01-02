create table rodoviarias
(
    id          bigint       not null,
    nome        varchar(100) not null,
    logradouro  varchar(100) not null,
    numero      varchar(20)  not null,
    complemento varchar(100),
    bairro      varchar(100) not null,
    cidade      varchar(100) not null,
    uf          varchar(2)   not null,
    cep         varchar(8)   not null,

    constraint rodoviarias_pk primary key (id),
    constraint rodoviarias_unique_nome unique (nome)
);

create sequence if not exists rodoviarias_id_seq;

alter table rodoviarias
    alter column id set default nextval('rodoviarias_id_seq');