package com.empresa.includeimobapi.domain.model;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name="TB_USUARIO")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	private Long id;
	
	@Column(name = "DATA_CRIACAO")
	private OffsetDateTime dataCriacao;
	
	@Column(name = "DATA_ATUALIZACAO")
	private OffsetDateTime dataAtualizacao;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "NOME")
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_USUARIO")
	private TipoUsuario tipoUsuario;
	
}
