package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave3 {

	public static void main(String[] args) {
		
		int antall = 0;
		int sum = 0;
		
		while (true) {
			
			String input = JOptionPane.showInputDialog("Skriv inn x antall heltall og avslutt med 0.");
			int tall = Integer.parseInt(input);
			
			if (tall == 0) {
				break;
			}
			
			antall++;
			sum = sum + tall;
		}
		
		System.out.println("Antall tall: " + antall);
		System.out.println("Sum: " + sum);

	}

}