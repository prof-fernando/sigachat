package br.edu.iffarroupilha.sigachat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.iffarroupilha.sigachat.modelos.Usuario;
import br.edu.iffarroupilha.sigachat.modelos.repositorios.GrupoRepositorio;

/**
 * <p>
 * Classe de serviços (regras de negócio) para o grupo
* </p>
* @author Professor
* @since Nov 6, 2024 7:36:00 PM
*/
@Service
public class GrupoService extends AService{
	
	private GrupoRepositorio  repositorio;
	
	 public GrupoService(GrupoRepositorio  repositorio) {
		 super(repositorio);	
		 this.repositorio = repositorio;
	}
}
