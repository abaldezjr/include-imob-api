package com.empresa.includeimobapi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.includeimobapi.domain.service.UsuarioService;
import com.empresa.includeimobapi.resources.dto.UsuarioDTO;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<UsuarioDTO> findAll() {
		return usuarioService.findAll();
	}
	
//	@PostMapping
//	@ResponseStatus(HttpStatus.CREATED)
//	public Usuario??? adicionar(@RequestBody Usuario??? usuario) {
//		
//	}
	
//	@PutMapping("/{usuarioId}")
//	public ResponseEntity<Usuario???> atualizar(@PathVariable Long clienteId, @RequestBody Usuario??? usuario){
//		
//	}
//	
//	@DeleteMapping("{usuarioId}")
//	public ResponseEntity<Void> remover(@PathVariable Long usuarioId){
//		
//	}

}
