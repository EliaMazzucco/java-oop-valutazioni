package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		/*/
		 * Classe Main con metodo main in cui create un array di 20 CalcolaValutazione, lo popolate con id studente progressivo (da 1 a 20), percentuale assenze e media voti generati random. 
		 * Per ogni elemento dell�array stampate a video l�id studente e se � promosso o bocciato
		 * 
		 */
		
		CalcolaValutazione [] calcolaValutazione = new CalcolaValutazione[20];
		Random randomGenerator = new Random();
		
		int idStudente, percAssenze;
		double mediaVoti;
		
		for (int i = 0; i < calcolaValutazione.length; i++) {
			idStudente = randomGenerator.nextInt(20) + 1;
			percAssenze  = randomGenerator.nextInt(100);
			mediaVoti = randomGenerator.nextInt(5);
			
			calcolaValutazione[i] = new CalcolaValutazione(idStudente, percAssenze, mediaVoti);
			
			System.out.println(calcolaValutazione[i]);
		}
		
		
	}

}