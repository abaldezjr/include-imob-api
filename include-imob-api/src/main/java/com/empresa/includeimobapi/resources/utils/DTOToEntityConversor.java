package com.empresa.includeimobapi.resources.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.empresa.includeimobapi.domain.model.Cliente;
import com.empresa.includeimobapi.domain.model.Imobiliaria;
import com.empresa.includeimobapi.domain.model.Usuario;
import com.empresa.includeimobapi.resources.dto.ClienteDTO;
import com.empresa.includeimobapi.resources.dto.ImobiliariaDTO;
import com.empresa.includeimobapi.resources.dto.UsuarioDTO;

@Component
public class DTOToEntityConversor {

	public Usuario convertUsuarioDtoToEntity(UsuarioDTO usuarioDto) {
		Usuario usuario = new Usuario();
		/*
		 * if(!Utils.isNullOrEmpty(usuario)) {
		 * if(!Utils.isNullOrEmpty(usuarioDto.getId())) {
		 * usuario.setId(usuarioDto.getId()); }
		 * if(!Utils.isNullOrEmpty(usuarioDto.getEmail())) {
		 * usuario.setEmail(usuarioDto.getEmail()); }
		 * if(!Utils.isNullOrEmpty(usuarioDto.getNome())) {
		 * usuario.setNome(usuarioDto.getNome()); }
		 * if(!Utils.isNullOrEmpty(usuarioDto.getTipoUsuario())) {
		 * usuario.setTipoUsuario(usuarioDto.getTipoUsuario()); } }
		 */

		return usuario;
	}

	public UsuarioDTO convertUsuarioEntityToDTO(Usuario usuario) {
		UsuarioDTO usuarioDto = new UsuarioDTO();
		if (!Utils.isNullOrEmpty(usuario)) {
			if (!Utils.isNullOrEmpty(usuario.getId())) {
				usuarioDto.setId(usuario.getId());
			}
			if (!Utils.isNullOrEmpty(usuario.getEmail())) {
				usuarioDto.setEmail(usuario.getEmail());
			}
			if (!Utils.isNullOrEmpty(usuario.getNome())) {
				usuarioDto.setNome(usuario.getNome());
			}
			if (!Utils.isNullOrEmpty(usuario.getTipoUsuario())) {
				usuarioDto.setTipoUsuario(usuario.getTipoUsuario());
			}
		}
		return usuarioDto;
	}

	public List<UsuarioDTO> convertListUsuarioEntityToDTO(List<Usuario> usuarios) {
		List<UsuarioDTO> usuariosDto = new ArrayList<>();
		for (Usuario u : usuarios) {
			usuariosDto.add(convertUsuarioEntityToDTO(u));
		}
		return usuariosDto;
	}

	public Imobiliaria convertImobiliariaDtoToEntity(ImobiliariaDTO imobiliariaDto) {
		return null;
	}

	public ImobiliariaDTO convertImobiliariaEntityToDTO(Imobiliaria imobiliaria) {
		ImobiliariaDTO imobiliariaDto = new ImobiliariaDTO();
		if (!Utils.isNullOrEmpty(imobiliaria)) {
			if (!Utils.isNullOrEmpty(imobiliaria.getId())) {
				imobiliariaDto.setId(imobiliaria.getId());
			}

			if (!Utils.isNullOrEmpty(imobiliaria.getNome())) {
				imobiliariaDto.setNome(imobiliaria.getNome());
			}

			if (!Utils.isNullOrEmpty(imobiliaria.getUsuario())) {
				imobiliariaDto.setIdUsuario(imobiliaria.getUsuario().getId());
			}
		}
		return imobiliariaDto;
	}

	public List<ImobiliariaDTO> convertListImobiliariaEntityToDTO(List<Imobiliaria> imobiliarias) {
		List<ImobiliariaDTO> imobiliariasDto = new ArrayList<>();
		for (Imobiliaria i : imobiliarias) {
			imobiliariasDto.add(convertImobiliariaEntityToDTO(i));
		}
		return imobiliariasDto;
	}

	public List<ClienteDTO> convertListClienteEntityToDTO(List<Cliente> clientes) {
		List<ClienteDTO> clientesDto = new ArrayList<>();
		for (Cliente c : clientes) {
			clientesDto.add(convertClienteEntityToDTO(c));
		}
		return clientesDto;
	}

	private ClienteDTO convertClienteEntityToDTO(Cliente cliente) {
		ClienteDTO clienteDto = new ClienteDTO();
		if (!Utils.isNullOrEmpty(cliente)) {
			if (!Utils.isNullOrEmpty(cliente.getId())) {
				clienteDto.setId(cliente.getId());
			}
			if (!Utils.isNullOrEmpty(cliente.getNome())) {
				clienteDto.setNome(cliente.getNome());
			}

			if (!Utils.isNullOrEmpty(cliente.getEmail())) {
				clienteDto.setEmail(cliente.getEmail());
			}
		}
		return clienteDto;
	}

//	public List<UsuarioDTO> convertListUsuarioEntityToDTO2(List<Usuario> usuarios) {
//		return usuarios.stream()
//				.map(this::convertUsuarioEntityToDTO)
//				.collect(Collectors.toList());
//	}

}
