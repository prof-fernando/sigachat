package br.edu.iffarroupilha.sigachat.modelo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.iffarroupilha.sigachat.modelo.Usuario;

public interface UsuarioRepositorio 
     extends JpaRepository<Usuario, String> {

	List<Usuario> findByNome(String nome);

}
