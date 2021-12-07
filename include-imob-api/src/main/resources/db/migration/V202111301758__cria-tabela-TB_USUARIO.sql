create table TB_USUARIO (
	ID_USUARIO bigint not null auto_increment,
	DATA_CRIACAO DATETIME NOT NULL DEFAULT current_timestamp,
	DATA_ATUALIZACAO DATETIME,
	EMAIL varchar(255) not null,
	NOME varchar(60) not null,
	TIPO_USUARIO varchar(60) not null,
	primary key(ID_USUARIO)
);