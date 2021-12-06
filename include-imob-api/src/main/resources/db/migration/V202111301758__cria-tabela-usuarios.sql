create table TB_USUARIO (
	ID_USUARIO bigint not null auto_increment,
	EMAIL varchar(255) not null,
	NOME varchar(60) not null,
	primary key(ID_USUARIO)
);