package br.edu.iffarroupilha.sigachat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iffarroupilha.sigachat.services.PreferenciasService;

/**
 * <p>
 * Controle para delegar as ações pata a entidade Preferencias 
* </p>
* @author Professor
* @since Nov 6, 2024 8:24:36 PM
*/
@RestController
@RequestMapping("/preferencias")
public class PreferenciasControle {
	@Autowired
	private PreferenciasService servico;
		
	
}
