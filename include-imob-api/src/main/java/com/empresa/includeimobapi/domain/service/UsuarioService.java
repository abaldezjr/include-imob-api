package com.empresa.includeimobapi.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.includeimobapi.domain.repository.UsuarioRepository;
import com.empresa.includeimobapi.resources.dto.UsuarioDTO;
import com.empresa.includeimobapi.resources.utils.DTOToEntityConversor;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private DTOToEntityConversor dtoToEntityConversor;

	public List<UsuarioDTO> findAll() {
		return dtoToEntityConversor.convertListUsuarioEntityToDTO(usuarioRepository.findAll());
	}
	
}
