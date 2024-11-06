package br.edu.iffarroupilha.sigachat.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Classe de dominio da aplicacao, representa um usuario
 * </p>
 * 
 * @since 26/10/2024 20:24
 * @author Professor
 */
@Entity
public class Usuario implements IEntidade {
	@Id
	private String email;
	@Column(nullable = false)
	private String nome;
	private String senha;
	private String foto;
	private String status;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
