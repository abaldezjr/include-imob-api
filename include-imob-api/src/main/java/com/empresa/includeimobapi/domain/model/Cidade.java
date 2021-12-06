package com.empresa.includeimobapi.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;

@Entity
public class Cidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String abreviacao;
	
	//@OneToMany(mappedBy = "entrega", cascade = CascadeType.ALL)
	//List
	
	@ManyToOne
	private Estado estado;

}
