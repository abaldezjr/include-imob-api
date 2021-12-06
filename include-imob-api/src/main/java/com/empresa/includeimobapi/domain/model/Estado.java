package com.empresa.includeimobapi.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ESTADO")
public class Estado {
	
	@Id
	@Column(name = "ID_ESTADO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NOME")
	private String nome;

	@Column(name = "ABREVIACAO")
	private String abreviacao;
	
	@Column(name = "PAIS")
	private Pais pais;

}
