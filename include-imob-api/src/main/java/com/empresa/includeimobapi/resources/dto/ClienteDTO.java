package com.empresa.includeimobapi.resources.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@JsonInclude(Include.NON_EMPTY)
@Data
public class ClienteDTO {

	private Long id;
	private String email;
	private String nome;

}
