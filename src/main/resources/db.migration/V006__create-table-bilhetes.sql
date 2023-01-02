create table bilhetes
(
    id                     bigint         not null,
    codigo                 varchar(8)     not null,
    linha_id               bigint         not null,
    status                 varchar(20)    not null,
    passageiro_id          bigint         not null,
    poltrona_id            bigint         not null,
    data_hora_viagem       timestamp      not null,
    taxa_embarque          decimal(10, 2),
    desconto               decimal(10, 2),
    valor_total            decimal(10, 2) not null,
    data_hora_compra       timestamp      not null,
    data_hora_cancelamento timestamp,

    constraint bilhetes_pk primary key (id),
    constraint bilhetes_unique_codigo unique (codigo)
);

create sequence if not exists bilhetes_id_seq;

alter table bilhetes
    alter column id set default nextval('bilhetes_id_seq');