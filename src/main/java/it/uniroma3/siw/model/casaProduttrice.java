package it.uniroma3.siw.model;

import java.util.Objects;

import jakarta.persistence.Entity;

@Entity
public class casaProduttrice {
	private String nome;
	private String fondatore;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFondatore() {
		return fondatore;
	}
	public void setFondatore(String fondatore) {
		this.fondatore = fondatore;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fondatore, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		casaProduttrice other = (casaProduttrice) obj;
		return Objects.equals(fondatore, other.fondatore) && Objects.equals(nome, other.nome);
	}
	
	

}
