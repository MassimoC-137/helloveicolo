package it.prova.helloveicolo.model;

import java.util.*;

public class Automobile extends Veicolo {

	private String modelloMacchina;

	public boolean veicoloEUgualeAdAltroVeicolo(Veicolo altroVeicolo) {

		if (!(altroVeicolo instanceof Automobile)) {
			return false;
		}
		Automobile temp = (Automobile) altroVeicolo;
		return this.modelloMacchina.equals(temp.getModelloMacchina());
	}

	public Automobile() {

	}

	public Automobile(String modelloMacchina) {

		this.modelloMacchina = modelloMacchina;
	}

	public String getModelloMacchina() {

		return modelloMacchina;
	}

	public void setModelloMacchina(String modelloMacchina) {

		this.modelloMacchina = modelloMacchina;
	}
	
	@Override
    public String toString() {
        return this.modelloMacchina;
    }

	public String accelera() {

		int nuovaVelocita = this.getVelocita() + 120;
		return "L'auto di modello " + this.modelloMacchina
				+ " sta accelerando e la sua velocità è cambiata da  " + this.getVelocita() + "km/h a "
				+ nuovaVelocita + " km/h";

	}

	public String frena() {
		int nuovaVelocita = this.getVelocita() - 40;
		return "L' auto di modello " + this.modelloMacchina + " sta decelerando e la sua velocità è cambiata da "
				+ this.getVelocita() + "km/h a " + nuovaVelocita + " km/h";
	}

	public String aggiungiVeicoloADeposito(Veicolo veicoloDaAggiungere, List<Veicolo> listaVeicoli) {

		if (!(veicoloDaAggiungere instanceof Automobile)) {
			return "Impossibile aggiungere il veicolo al deposito perchè non è un'auto. ";
		}

		listaVeicoli.add(veicoloDaAggiungere);
		return "Veicolo " + veicoloDaAggiungere + " aggiunto al deposito.";
	}

}
