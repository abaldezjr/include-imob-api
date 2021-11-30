create table usuarios (
	id bigint not null auto_increment,
	email varchar(255) not null,
	nome varchar(60) not null,
	primary key(id)
);