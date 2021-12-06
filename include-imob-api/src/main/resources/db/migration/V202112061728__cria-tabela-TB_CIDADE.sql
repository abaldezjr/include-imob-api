create table TB_CIDADE (
	ID_CIDADE bigint not null auto_increment,
	NOME varchar(60) not null,
    ABREVIACAO varchar(60) not null,
    ID_ESTADO bigint not null,
	primary key(ID_CIDADE)
);

alter table TB_CIDADE add constraint FK_CIDADE_ESTADO
foreign key(ID_ESTADO) references TB_ESTADO (ID_ESTADO);