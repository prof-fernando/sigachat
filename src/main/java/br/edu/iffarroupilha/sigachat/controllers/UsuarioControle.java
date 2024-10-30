package br.edu.iffarroupilha.sigachat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iffarroupilha.sigachat.modelo.Usuario;
import br.edu.iffarroupilha.sigachat.modelo.dto.UsuarioDTO;
import br.edu.iffarroupilha.sigachat.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioControle {
	@Autowired
	private UsuarioService servico;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Usuario salvar(UsuarioDTO dto){
		Usuario u = new Usuario();
		u.setEmail(dto.email());
		u.setNome(dto.nome());
		return servico.salvar(u);  
	}	
}
