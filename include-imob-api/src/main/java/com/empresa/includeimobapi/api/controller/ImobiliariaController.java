package com.empresa.includeimobapi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.includeimobapi.domain.service.ImobiliariaService;
import com.empresa.includeimobapi.resources.dto.ImobiliariaDTO;

@RestController
@RequestMapping("/imobiliarias")
public class ImobiliariaController {
	
	@Autowired
	private ImobiliariaService imobiliariaService;
	
	@GetMapping
	public List<ImobiliariaDTO> findAll() {
		return imobiliariaService.findAll();
	}

}
