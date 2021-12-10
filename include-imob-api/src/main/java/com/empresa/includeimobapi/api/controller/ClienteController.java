package com.empresa.includeimobapi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.includeimobapi.domain.service.ClienteService;
import com.empresa.includeimobapi.resources.dto.ClienteDTO;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public List<ClienteDTO> findAll() {
		return clienteService.findAll();
	}

}