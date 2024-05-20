package it.uniroma3.siw.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public abstract class dispositivoElettronico {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	    private String nome;
	    private String casaProduttrice;
	    private double prezzo;
	    
	    @OneToMany(mappedBy = "dispositivo", cascade = CascadeType.ALL)
	    private List<Prenotazione> prenotazioni;
	    
	/*	@ManyToOne
		private casaProduttrice marca;*/
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

	  
}
