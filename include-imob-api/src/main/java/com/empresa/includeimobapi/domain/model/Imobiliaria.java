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
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="TB_IMOBILIARIA")
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
	@JoinColumn(name = "ID_PROPRIETARIO")
	private Usuario usuario;
	
	@Column(name = "NOME")
	private String nome;
}
