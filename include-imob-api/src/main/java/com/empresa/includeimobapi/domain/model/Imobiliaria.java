package com.empresa.includeimobapi.domain.model;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Imobiliaria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_IMOBILIARIA")
	private Long id;
	
	@Column(name = "DATA_CRIACAO")
	private OffsetDateTime dataCriacao;
	
	@Column(name = "DATA_ATUALIZACAO")
	private OffsetDateTime dataAtualizacao;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_USUARIO_CRIADOR")
	private Usuario usuario;
	
	@Column(name = "NOME")
	private String nome;
}
