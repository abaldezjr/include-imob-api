create table TB_IMOVEL (
	ID_IMOVEL bigint not null auto_increment,
	ID_CIDADE bigint not null,
    RUA varchar(60) not null,
    NUMERO varchar(60) not null,
    COMPLEMENTO varchar(60) not null,
    TIPO_IMOVEL varchar(60) not null,
    QTD_QUARTO bigint not null,
    QTD_BANHEIRO bigint not null,
    QTD_VAGAS_GARAGEM bigint not null,
    QTD_SALA bigint not null,
    QTD_COMODO bigint not null,
    primary key(ID_IMOVEL)
);

alter table TB_IMOVEL add constraint FK_IMOVEL_CIDADE
foreign key(ID_CIDADE) references TB_CIDADE (ID_CIDADE);