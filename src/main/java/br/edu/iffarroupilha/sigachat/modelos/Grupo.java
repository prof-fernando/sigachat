package br.edu.iffarroupilha.sigachat.modelos;

import java.util.Set;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Grupo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idGrupo;
	@ManyToOne
	@JoinColumn(name = "email_usuario", nullable = false)
	private Usuario proprietario;
	@Column(nullable = false)
	private String nome;
	@ManyToMany
	@JoinTable(
			name = "grupoUsuario",
			joinColumns = @JoinColumn(name = "idGrupo"), inverseJoinColumns = @JoinColumn(name = "email_usuario"))
	private Set<Usuario> participantes;

	public long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(long idGrupo) {
		this.idGrupo = idGrupo;
	}

	public Usuario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Usuario proprietario) {
		this.proprietario = proprietario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Usuario> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Set<Usuario> participantes) {
		this.participantes = participantes;
	}

}
