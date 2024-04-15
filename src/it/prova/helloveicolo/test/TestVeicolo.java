package it.prova.helloveicolo.test;
import java.util.*;

import it.prova.helloveicolo.model.Automobile;
import it.prova.helloveicolo.model.Motocicletta;
import it.prova.helloveicolo.model.Nave;
import it.prova.helloveicolo.model.Veicolo;

public class TestVeicolo {

	public static void main(String[] args) {

		Veicolo veic1 = new Motocicletta("Enduro"); 
		Veicolo veic2 = new Automobile("Maserati"); 
		Veicolo veic3 = new Nave("Titanic"); 
		Veicolo veic4 = new Motocicletta("Naked"); 
		Veicolo veic5 = new Automobile("Tesla"); 
		Veicolo veic6 = new Nave("Caremar"); 
		
		Veicolo veic7 = new Motocicletta("Naked");
		Veicolo veic8 = new Automobile("Tesla");
		Veicolo veic9 = new Nave("Titanic"); 
		
		Veicolo mioVeicolo = new Motocicletta("Sportiva"); 
		
		
		List<Veicolo> deposito = new ArrayList<>();
		List<Veicolo> garage = new ArrayList<>();
		List<Veicolo> porto = new ArrayList<>();
		
//		ArrayList<Veicolo> deposito1 = new ArrayList<Veicolo>();
		
		garage.add(veic1); 
		deposito.add(veic2); 
		porto.add(veic3); 
		garage.add(veic4); 
		deposito.add(veic5); 
		porto.add(veic6); 
		garage.add(veic5);
		garage.remove(veic5); 
		
		
		System.out.println("Le moto sono uguali? " + veic1.veicoloEUgualeAdAltroVeicolo(veic7));
		System.out.println("Le moto sono uguali? " + veic4.veicoloEUgualeAdAltroVeicolo(veic7));
		
		
		
		System.out.println(veic7.aggiungiVeicoloADeposito(veic9, garage));
	

		
	}

}
