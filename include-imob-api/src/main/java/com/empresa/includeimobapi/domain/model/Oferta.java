package com.empresa.includeimobapi.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Oferta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ID_IMOVEL")
	@OneToOne
	private Imovel imovel;
	
	@Column(name = "VALOR_OFERTA")
	private Double valorOferta;
	
	//private Long idUsuario;
	//private Date dataInsercao;
	//private Date dataAtualizacao;

}
