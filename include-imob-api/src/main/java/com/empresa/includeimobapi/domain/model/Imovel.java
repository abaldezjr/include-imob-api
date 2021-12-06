package com.empresa.includeimobapi.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "TB_IMOVEL")
public class Imovel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_IMOVEL")
	private Long id;
	
	@Column(name = "ID_CIDADE")
	@ManyToOne
	private Cidade cidade;
	
	@Column(name = "ID_ESTADO")
	@ManyToOne
	private Estado estado;
	
	@Column(name = "ID_PAIS")
	@ManyToOne
	private Pais pais;
	
	@Column(name = "RUA")
	private String rua;
	
	@Column(name = "NUMERO")
	private String numero;
	
	@Column(name = "COMPLEMENTO")
	private String complemento;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_IMOVEL")
	private TipoImovel tipoImovel;
	
	@Column(name = "QTD_QUARTO")
	private Integer qtdQuarto;
	
	@Column(name = "QTD_BANHEIRO")
	private Integer qtdBanheiro;
	
	@Column(name = "QTD_VAGAS_GARAGEM")
	private Integer qtdVagasGaragem;
	
	@Column(name = "QTD_SALA")
	private Integer qtdSala;
	
	@Column(name = "QTD_COMODO")
	private Integer qtdComodo;

}
