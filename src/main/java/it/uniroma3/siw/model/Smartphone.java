package it.uniroma3.siw.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Smartphone extends dispositivoElettronico{
	
	private String SO;
	
	private int batteria;
	
	private int memoriaRam;

	public String getSO() {
		return SO;
	}

	public void setSO(String sO) {
		SO = sO;
	}

	public int getBatteria() {
		return batteria;
	}

	public void setBatteria(int batteria) {
		this.batteria = batteria;
	}
	
	
	
}
