package com.empresa.includeimobapi.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PAIS")
	private Pais pais;

}
