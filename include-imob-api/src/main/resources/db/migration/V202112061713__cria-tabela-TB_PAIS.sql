create table TB_PAIS (
	ID_PAIS bigint not null auto_increment,
	NOME varchar(60) not null,
    ABREVIACAO varchar(60) not null,
	primary key(ID_PAIS)
);