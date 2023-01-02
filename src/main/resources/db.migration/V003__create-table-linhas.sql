create table linhas
(
    id                    bigint      not null,
    codigo                varchar(8)  not null,
    status                varchar(20) not null,
    rodoviaria_origem_id  bigint      not null,
    rodoviaria_destino_id bigint      not null,
    data_hora_saida       timestamp   not null,
    duracao_viagem        integer,
    data_hora_cadastro    timestamp   not null,
    data_hora_alteracao   timestamp,

    constraint linhas_pk primary key (id),
    constraint linhas_unique_codigo unique (codigo)
);

create sequence if not exists linhas_id_seq;

alter table linhas
    alter column id set default nextval('linhas_id_seq');