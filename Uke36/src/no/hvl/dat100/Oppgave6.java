package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class Oppgave6 {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(showInputDialog("Skriv inn et positivt heltall: "));
		int svar = 1;
		
		if (n > 0) {
			
			for (int i = 1; i <= n; i++) {
				svar = svar * i;
			}
			
			showMessageDialog(null, svar);
		}
		
		else {
			showMessageDialog(null, "Tallet du tastet inn kan ikke v�re negativt.");
		}

	}

}
