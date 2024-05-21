package it.uniroma3.siw.model;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public abstract class dispositivoElettronico {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	    private String nome;
	    private String casaProduttrice;
	    private double prezzo;
	    private int memoria;
	    
	    @OneToMany(mappedBy = "dispositivo", cascade = CascadeType.ALL)
	    private List<Prenotazione> prenotazioni;
	/*	@ManyToOne
		private casaProduttrice marca */
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCasaProduttrice() {
			return casaProduttrice;
		}
		public void setCasaProduttrice(String casaProduttrice) {
			this.casaProduttrice = casaProduttrice;
		}
		public double getPrezzo() {
			return prezzo;
		}
		public void setPrezzo(double prezzo) {
			this.prezzo = prezzo;
		}
		public int getMemoria() {
			return memoria;
		}
		public void setMemoria(int memoria) {
			this.memoria = memoria;
		}
		public List<Prenotazione> getPrenotazioni() {
			return prenotazioni;
		}
		public void setPrenotazioni(List<Prenotazione> prenotazioni) {
			this.prenotazioni = prenotazioni;
		}
		@Override
		public int hashCode() {
			return Objects.hash(casaProduttrice, id, nome, prenotazioni, prezzo);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			dispositivoElettronico other = (dispositivoElettronico) obj;
			return Objects.equals(casaProduttrice, other.casaProduttrice) && Objects.equals(id, other.id)
					&& Objects.equals(nome, other.nome) && Objects.equals(prenotazioni, other.prenotazioni)
					&& Double.doubleToLongBits(prezzo) == Double.doubleToLongBits(other.prezzo);
		}

	  
}
