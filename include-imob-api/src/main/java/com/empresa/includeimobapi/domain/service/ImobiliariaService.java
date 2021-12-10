package com.empresa.includeimobapi.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.includeimobapi.domain.repository.ImobiliariaDAO;
import com.empresa.includeimobapi.resources.dto.ImobiliariaDTO;
import com.empresa.includeimobapi.resources.utils.DTOToEntityConversor;

@Service
public class ImobiliariaService {

	@Autowired
	private ImobiliariaDAO imobiliariaRepository;

	@Autowired
	private DTOToEntityConversor dtoToEntityConversor;

	public List<ImobiliariaDTO> findAll() {
		return dtoToEntityConversor.convertListImobiliariaEntityToDTO(imobiliariaRepository.findAll());
	}

}
