package br.edu.iffarroupilha.sigachat.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.iffarroupilha.sigachat.modelos.repositorios.PreferenciasRepositorio;

/**
 * <p>
 * Classe de servico para entidade Preferencias
* </p>
* @author Professor
* @since Nov 6, 2024 8:23:07 PM
*/
@Service
public class PreferenciasService  extends AService{
	private PreferenciasRepositorio repositorio;
	
	public PreferenciasService(PreferenciasRepositorio repositorio) {
		super(repositorio);
		this.repositorio = repositorio;
	}

}
