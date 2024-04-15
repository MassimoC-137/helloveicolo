package it.prova.helloveicolo.model;

import java.util.*;

public class Motocicletta extends Veicolo{

	private String tipoDiMoto;

	public boolean veicoloEUgualeAdAltroVeicolo(Veicolo altroVeicolo) {
		
		if (! (altroVeicolo instanceof Motocicletta)) {
			return false; 
		}
		Motocicletta temp = (Motocicletta) altroVeicolo; 
		return this.tipoDiMoto.equals(temp.getTipoDiMoto());
	} 
	
	public Motocicletta() {
		
	}
	
	public Motocicletta(String tipoDiMoto) {
		
		this.tipoDiMoto = tipoDiMoto; 
	}
	
	public String getTipoDiMoto() {
		
		return tipoDiMoto;
	}
	
	public void setTipoDiMoto(String tipoDiMoto) {
	
		this.tipoDiMoto = tipoDiMoto; 
	}
	
	@Override
    public String toString() {
        return this.tipoDiMoto;
    }
	
	public String accelera() {

		int nuovaVelocita = this.getVelocita() + 150;
		return "La moto di tipo " + this.tipoDiMoto
				+ " sta impennando e la sua velocità è cambiata da  " + this.getVelocita() + "km/h a "
				+ nuovaVelocita + " km/h";

	}

	public String frena() {
		int nuovaVelocita = this.getVelocita() - 10;
		return "La moto di tipo " + this.tipoDiMoto + " sta facendo uno stoppie e la sua velocità è cambiata da "
				+ this.getVelocita() + "km/h a " + nuovaVelocita + " km/h";
	}

	public String aggiungiVeicoloADeposito(Veicolo veicoloDaAggiungere, List<Veicolo> listaVeicoli) {
		
		for (Veicolo veicolo : listaVeicoli) {
			if (! (veicolo instanceof Motocicletta)) {
				return "Impossibile aggiungere il veicolo al garage perchè non è un garage. ";
			}
		}
		if (! (veicoloDaAggiungere instanceof Motocicletta)) {
			return "Impossibile aggiungere il veicolo al garage perchè non è una moto. "; 
		}
		
		listaVeicoli.add(veicoloDaAggiungere);
		return "Veicolo " + veicoloDaAggiungere + " aggiunto al deposito." + listaVeicoli.toString(); 
	}
	
	
}
