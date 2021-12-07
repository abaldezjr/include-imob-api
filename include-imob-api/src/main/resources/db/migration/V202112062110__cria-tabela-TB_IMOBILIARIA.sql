create table TB_IMOBILIARIA (
	ID_IMOBILIARIA bigint not null auto_increment,
	DATA_CRIACAO DATETIME NOT NULL DEFAULT current_timestamp,
	DATA_ATUALIZACAO DATETIME,
	ID_USUARIO bigint not null,
    primary key(ID_IMOBILIARIA)
);

alter table TB_IMOBILIARIA add constraint FK_IMOBILIARIA_USUARIO
foreign key(ID_USUARIO) references TB_USUARIO (ID_USUARIO);