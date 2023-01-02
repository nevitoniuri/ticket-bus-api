create table poltronas
(
    id        bigint         not null,
    numero    varchar(5)     not null,
    valor     decimal(10, 2) not null,
    onibus_id bigint         not null,

    constraint poltronas_pk primary key (id)
);

create sequence if not exists poltronas_id_seq;

alter table poltronas
    alter column id set default nextval('poltronas_id_seq');