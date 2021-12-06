package com.empresa.includeimobapi.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Cidade cidade;
	private Estado estado;
	private Pais pais;
	private String rua;
	private String numero;
	private String complemento;

}
