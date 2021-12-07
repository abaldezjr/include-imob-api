create table TB_USUARIO_IMOBILIARIA (
	ID_USUARIO_IMOBILIARIA bigint not null auto_increment,
    ID_USUARIO bigint not null,
    ID_IMOBILIARIA bigint not null,
	primary key(ID_USUARIO_IMOBILIARIA)
);

alter table TB_USUARIO_IMOBILIARIA add constraint FK_USUARIO_IMOBILIARIA_USUARIO
foreign key(ID_USUARIO) references TB_USUARIO (ID_USUARIO);

alter table TB_USUARIO_IMOBILIARIA add constraint FK_USUARIO_IMOBILIARIA_IMOBILIARIA
foreign key(ID_IMOBILIARIA) references TB_IMOBILIARIA (ID_IMOBILIARIA);