package com.empresa.includeimobapi.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="TB_CLIENTE")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CLIENTE")
	private Long id;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "NOME")
	private String nome;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_IMOBILIARIA")
	private Imobiliaria imobiliaria;
	
}