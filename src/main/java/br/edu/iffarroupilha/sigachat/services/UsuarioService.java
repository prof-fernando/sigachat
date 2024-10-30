package br.edu.iffarroupilha.sigachat.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.iffarroupilha.sigachat.modelo.Grupo;
import br.edu.iffarroupilha.sigachat.modelo.Usuario;
import br.edu.iffarroupilha.sigachat.modelo.repositorios.UsuarioRepositorio;
@Service
public class UsuarioService {

	private UsuarioRepositorio repositorio;

	public UsuarioService(UsuarioRepositorio repositorio) {
		this.repositorio = repositorio;
	}
	
	public Usuario salvar(Usuario usuario) {
		
		return this.repositorio.save(usuario);
	}
	public List<Usuario> buscaPorNome(String nome){
		return this.repositorio.findByNome(nome);
	}
}
