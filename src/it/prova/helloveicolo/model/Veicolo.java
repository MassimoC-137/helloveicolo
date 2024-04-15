package it.prova.helloveicolo.model;

import java.util.List;

public abstract class Veicolo {

	private int velocita; 
	
	public int getVelocita() {
		return velocita;
	}
	public void setVelocita(int velocita) {
		this.velocita = velocita;
	}
	
	abstract public String accelera(); 
	abstract public String frena(); 
	
	abstract public boolean veicoloEUgualeAdAltroVeicolo(Veicolo altroVeicolo);
	abstract public String aggiungiVeicoloADeposito(Veicolo veicoloDaAggiungere, List<Veicolo> listaVeicoli); 
	
	
	
	
}
