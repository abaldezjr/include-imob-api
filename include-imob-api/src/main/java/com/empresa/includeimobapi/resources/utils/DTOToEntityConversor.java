package com.empresa.includeimobapi.resources.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.empresa.includeimobapi.domain.model.Usuario;
import com.empresa.includeimobapi.resources.dto.UsuarioDTO;

@Component
public class DTOToEntityConversor {
	
	public Usuario convertUsuarioDtoToEntity(UsuarioDTO usuarioDto) {
		Usuario usuario = new Usuario();
		
		return usuario;
	}
	
	public UsuarioDTO convertUsuarioEntityToDTO(Usuario usuario) {
		UsuarioDTO usuarioDto = new UsuarioDTO();
		if(!Utils.isNullOrEmpty(usuario)) {
			if(!Utils.isNullOrEmpty(usuario.getId())) {
				usuarioDto.setId(usuario.getId());
			}
			if(!Utils.isNullOrEmpty(usuario.getEmail())) {
				usuarioDto.setEmail(usuario.getEmail());
			}
			if(!Utils.isNullOrEmpty(usuario.getNome())) {
				usuarioDto.setNome(usuario.getNome());
			}
			if(!Utils.isNullOrEmpty(usuario.getTipoUsuario())) {
				usuarioDto.setTipoUsuario(usuario.getTipoUsuario());
			}
		}
		return usuarioDto;
	}
	
	public List<UsuarioDTO> convertListUsuarioEntityToDTO(List<Usuario> usuarios) {
		List<UsuarioDTO> usuariosDto = new ArrayList<>();
		for(Usuario u: usuarios) {
			usuariosDto.add(convertUsuarioEntityToDTO(u));
		}
		return usuariosDto;
	}
			

}
