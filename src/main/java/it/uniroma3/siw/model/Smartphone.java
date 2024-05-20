package it.uniroma3.siw.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Smartphone extends dispositivoElettronico{
	
	private Long id;
	
	private String SO;
	
	private int batteria;
	
	
	
}
