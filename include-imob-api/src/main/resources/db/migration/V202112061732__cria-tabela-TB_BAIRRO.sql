create table TB_BAIRRO (
	ID_BAIRRO bigint not null auto_increment,
	NOME varchar(60) not null,
    ID_CIDADE bigint not null,
	primary key(ID_BAIRRO)
);

alter table TB_BAIRRO add constraint FK_BAIRRO_CIDADE
foreign key(ID_CIDADE) references TB_CIDADE (ID_CIDADE);