create table TB_OFERTA (
	ID_OFERTA bigint not null auto_increment,
	DATA_CRIACAO DATETIME NOT NULL DEFAULT current_timestamp,
	DATA_ATUALIZACAO DATETIME,
	ID_USUARIO bigint not null,
	ID_IMOVEL bigint not null,
    TIPO_OFERTA varchar(60) not null,
    VALOR_OFERTA double not null,
    primary key(ID_OFERTA)
);

alter table TB_OFERTA add constraint FK_OFERTA_IMOVEL
foreign key(ID_IMOVEL) references TB_IMOVEL (ID_IMOVEL);

alter table TB_OFERTA add constraint FK_OFERTA_USUARIO
foreign key(ID_USUARIO) references TB_USUARIO (ID_USUARIO);