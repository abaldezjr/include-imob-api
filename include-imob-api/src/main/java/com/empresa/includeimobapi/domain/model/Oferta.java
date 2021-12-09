package com.empresa.includeimobapi.domain.model;

import java.io.Serializable;
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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "TB_OFERTA")
public class Oferta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_OFERTA")
	private Long id;
	
	@Column(name = "DATA_CRIACAO")
	private OffsetDateTime dataCriacao;
	
	@Column(name = "DATA_ATUALIZACAO")
	private OffsetDateTime dataAtualizacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_IMOVEL")
	private Imovel imovel;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_OFERTA")
	private TipoNegocio tipoOferta;
	
	@Column(name = "VALOR_OFERTA")
	private Double valorOferta;
	
	//private Long idUsuario;
	//private Date dataInsercao;
	//private Date dataAtualizacao;

}
