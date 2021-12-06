create table TB_ESTADO (
	ID_ESTADO bigint not null auto_increment,
	NOME varchar(60) not null,
    ABREVIACAO varchar(60) not null,
    ID_PAIS bigint not null,
	primary key(ID_ESTADO)
);

alter table TB_ESTADO add constraint FK_ESTADO_PAIS
foreign key(ID_PAIS) references TB_PAIS (ID_PAIS);