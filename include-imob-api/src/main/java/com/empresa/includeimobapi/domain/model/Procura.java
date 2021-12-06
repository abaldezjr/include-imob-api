package com.empresa.includeimobapi.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PROCURA")
public class Procura implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ID_IMOVEL")
	@OneToOne
	private Imovel imovel;
	
	@Column(name = "VALOR_MINIMO")
	private Double valorMinimo;
	
	@Column(name = "VALOR_MAXIMO")
	private Double valorMaximo;
	
	@Column(name = "PESO_RANGE_VALOR")
	private Integer pesoRangeValor;
	
	@Column(name = "PESO_QTD_QUARTO")
	private Integer pesoQtdQuarto;
	
	@Column(name = "PESO_QTD_BANHEIRO")
	private Integer pesoQtdBanheiro;
	
	@Column(name = "PESO_QTD_VAGAS_GARAGEM")
	private Integer pesoQtdVagasGaragem;
	
	@Column(name = "PESO_QTD_SALA")
	private Integer pesoQtdSala;
	
	@Column(name = "PESO_QTD_COMODO")
	private Integer pesoQtdComodo;
	
	@Column(name = "PESO_CIDADE")
	private Integer pesoCidade;
	
	@Column(name = "PESO_BAIRRO")
	private Integer pesoBairro;
	
	//private Long idUsuario;
	//private Date dataInsercao;
	//private Date dataAtualizacao;

}
