package com.empresa.includeimobapi.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_BAIRRO")
public class Bairro {
	
	@Id
	@Column(name = "ID_BAIRRO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "ABREVIACAO")
	private String abreviacao;
	
	@Column(name = "QTD_QUARTO")
	private Cidade cidade;

}
