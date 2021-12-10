package com.empresa.includeimobapi.resources.dto;

import java.time.OffsetDateTime;

import com.empresa.includeimobapi.domain.model.Usuario;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@JsonInclude(Include.NON_EMPTY)
@Data
public class ImobiliariaDTO {
	
	private Long id;
	private OffsetDateTime dataCriacao;
	private OffsetDateTime dataAtualizacao;
	private Long idUsuario;
	private String nome;

}
