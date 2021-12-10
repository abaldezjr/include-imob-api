package com.empresa.includeimobapi.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.includeimobapi.domain.repository.ClienteDAO;
import com.empresa.includeimobapi.domain.repository.ImobiliariaDAO;
import com.empresa.includeimobapi.resources.dto.ClienteDTO;
import com.empresa.includeimobapi.resources.dto.ImobiliariaDTO;
import com.empresa.includeimobapi.resources.utils.DTOToEntityConversor;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteDAO clienteDAO;
	
	@Autowired
	private DTOToEntityConversor dtoToEntityConversor;

	public List<ClienteDTO> findAll() {
		return dtoToEntityConversor.convertListClienteEntityToDTO(clienteDAO.findAll());
	}
	
}
