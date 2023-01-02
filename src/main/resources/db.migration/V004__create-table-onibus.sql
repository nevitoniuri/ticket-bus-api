create table onibus
(
    id                  bigint       not null,
    placa               varchar(8)   not null,
    modelo              varchar(100) not null,
    ano_fabricacao      integer      not null,
    status              varchar(20)  not null,
    linha_id            bigint       not null,
    data_hora_cadastro  timestamp    not null,
    data_hora_alteracao timestamp,

    constraint onibus_pk primary key (id),
    constraint onibus_unique_placa unique (placa)
);

create sequence if not exists onibus_id_seq;

alter table onibus
    alter column id set default nextval('onibus_id_seq');