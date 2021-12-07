create table TB_PROCURA (
	ID_PROCURA bigint not null auto_increment,
	ID_IMOVEL bigint not null,
    TIPO_PROCURA varchar(60) not null,
    VALOR_MINIMO double not null,
    VALOR_MAXIMO double not null,
    PESO_RANGE_VALOR bigint not null,
    PESO_QTD_QUARTO bigint not null,
    PESO_QTD_BANHEIRO bigint not null,
    PESO_QTD_VAGAS_GARAGEM bigint not null,
    PESO_QTD_SALA bigint not null,
    PESO_QTD_COMODO bigint not null,
    PESO_CIDADE bigint not null,
    PESO_BAIRRO bigint not null,
    primary key(ID_PROCURA)
);

alter table TB_PROCURA add constraint FK_PROCURA_IMOVEL
foreign key(ID_IMOVEL) references TB_IMOVEL (ID_IMOVEL);