package com.empresa.includeimobapi.resources.dto;

import java.time.OffsetDateTime;

import com.empresa.includeimobapi.domain.model.TipoUsuario;

import lombok.Data;

@Data
public class UsuarioDTO {
	
	private Long id;
	private OffsetDateTime dataCriacao;
	private OffsetDateTime dataAtualizacao;
	private String email;
	private String nome;
	private TipoUsuario tipoUsuario;

}
