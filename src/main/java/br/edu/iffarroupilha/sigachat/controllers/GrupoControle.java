package br.edu.iffarroupilha.sigachat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iffarroupilha.sigachat.modelos.Grupo;
import br.edu.iffarroupilha.sigachat.modelos.Usuario;
import br.edu.iffarroupilha.sigachat.modelos.dto.GrupoDTO;
import br.edu.iffarroupilha.sigachat.modelos.repositorios.UsuarioRepositorio;
import br.edu.iffarroupilha.sigachat.services.GrupoService;

/**
 * <p>
 * Controlador para entidade grupo
* </p>
* @author Professor
* @since Nov 6, 2024 8:08:06 PM
*/
@RestController
@RequestMapping("/grupo")
public class GrupoControle {
	@Autowired
	private GrupoService servico;
	@Autowired
	private UsuarioRepositorio repositorio;
	
	
	@PostMapping 
	public ResponseEntity<Grupo> gravar( @RequestBody GrupoDTO dto){
		Grupo g = new Grupo(dto);
		Usuario proprietario
		= repositorio.findByEmail(dto.email());	
		
		g.setProprietario(proprietario);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body( this.servico.gravar(g));
	}
	
}
