package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave1 {

	public static void main(String[] args) {

		int a = 7;

		// Oppgave a)
		if (a < 0) {
			System.out.println("mindre enn 0.");
		}
		else if (a == 0) {
			System.out.println("Lik 0.");
		}
		else if (a > 0) {
			System.out.println("St�rre enn 0.");
		}

		// Oppgave b)
		if ((a >= 5) && (a <= 8)) {
			System.out.println(a + " er innenfor intervallet.");
		}
		else {
			System.out.println(a + " er utenfor intervallet.");
		}

		// Oppgave c)
		String aTxt = JOptionPane.showInputDialog("Random heltall:");
		int b = Integer.parseInt(aTxt);

		switch (b) {
		case 0: aTxt = "Null er innenfor intervallet."; break;
		case 1: aTxt = "En er innenfor intervallet."; break;
		case 2: aTxt = "To er innenfor intervallet."; break;
		case 3: aTxt = "Tre er innenfor intervallet."; break;
		case 4: aTxt = "Fire er innenfor intervallet."; break;
		default: aTxt = "Ulovlig verdi"; break;
		}

		System.out.println(aTxt);
	}

}
