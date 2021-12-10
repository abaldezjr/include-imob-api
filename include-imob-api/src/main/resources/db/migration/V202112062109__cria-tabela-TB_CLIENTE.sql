create table TB_CLIENTE (
	ID_CLIENTE bigint not null auto_increment,
	DATA_CRIACAO DATETIME NOT NULL DEFAULT current_timestamp,
	DATA_ATUALIZACAO DATETIME,
	ID_IMOBILIARIA bigint not null,
	EMAIL varchar(255) not null,
	NOME varchar(60) not null,
	primary key(ID_CLIENTE)
);

alter table TB_CLIENTE add constraint FK_CLIENTE_IMOBILIARIA
foreign key(ID_IMOBILIARIA) references TB_IMOBILIARIA (ID_IMOBILIARIA);