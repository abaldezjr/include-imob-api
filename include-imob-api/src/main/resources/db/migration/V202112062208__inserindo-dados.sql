insert INTO tb_pais (NOME, ABREVIACAO) VALUES ('Brasil', 'BR');
INSERT INTO TB_ESTADO (NOME, ABREVIACAO, ID_PAIS) VALUES ('Rio Grande do Sul', 'RS', (select p.Id_PAIS from TB_PAIS p where Nome = 'Brasil'));
insert into TB_CIDADE (nome, abreviacao, id_estado) values ('Rio Grande', 'RG', (select es.id_estado from TB_ESTADO es where es.nome = 'Rio Grande do Sul'));
insert into TB_BAIRRO (nome, id_cidade) values ('Centro', (select ci.id_cidade from TB_CIDADE ci where ci.nome = 'Rio Grande'));
insert into TB_BAIRRO (nome, id_cidade) values ('Cassino', (select ci.id_cidade from TB_CIDADE ci where ci.nome = 'Rio Grande'));
insert into tb_usuario(DATA_ATUALIZACAO, EMAIL, NOME,TIPO_USUARIO) values ('2021-09-12 11:50:00','abaldezjr@gmail.com','Baldez Jr', 'ADMINISTRADOR');
insert into tb_usuario(DATA_ATUALIZACAO, EMAIL, NOME,TIPO_USUARIO) values ('2021-09-12 11:50:00','rodrigoflipoff@gmail.com','Rodrigo Arvoredo', 'ADMINISTRADOR');
insert into tb_imobiliaria(DATA_ATUALIZACAO, ID_PROPRIETARIO, NOME) values ('2021-09-13 11:50:00', 1, 'Imobiliaria teste');