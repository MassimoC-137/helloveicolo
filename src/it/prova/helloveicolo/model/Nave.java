package it.prova.helloveicolo.model;

import java.util.*;

public class Nave extends Veicolo{

	private String nomeNave;

	public boolean veicoloEUgualeAdAltroVeicolo(Veicolo altroVeicolo) {

		if (! (altroVeicolo instanceof Nave)) {
			return false; 
		}
		Nave temp = (Nave) altroVeicolo; 
		return this.nomeNave.equals(temp.getNomeNave());
	} 
	
	public Nave() {
		
	}

	public Nave(String nomeNave) {
		
		this.nomeNave = nomeNave; 
	}

	public String getNomeNave() {

		return nomeNave;
	}

	public void setNomeNave(String nomeNave) {

		this.nomeNave = nomeNave;
	}
	
	@Override
    public String toString() {
        return this.nomeNave;
    }
	
	public String accelera() {

		int nuovaVelocita = this.getVelocita() + 70;
		return "La nave chiamata " + this.nomeNave
				+ " sta accelerando e la sua velocità è cambiata da  " + this.getVelocita() + "nodi a "
				+ nuovaVelocita + " nodi";

	}

	public String frena() {
		int nuovaVelocita = this.getVelocita() - 20;
		return "La nave chiamata " + this.nomeNave + " sta decelerando e la sua velocità è cambiata da "
				+ this.getVelocita() + "nodi a " + nuovaVelocita + " nodi";
	}

	public String aggiungiVeicoloADeposito(Veicolo veicoloDaAggiungere, List<Veicolo> listaVeicoli) {
		
		if (! (veicoloDaAggiungere instanceof Nave)) {
			return "Impossibile aggiungere il veicolo al porto perchè non è una nave. "; 
		}
		
		listaVeicoli.add(veicoloDaAggiungere);
		return "Veicolo " + veicoloDaAggiungere + " aggiunto al deposito."; 
	}
}
