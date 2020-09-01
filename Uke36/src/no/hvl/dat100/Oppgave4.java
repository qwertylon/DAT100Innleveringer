package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave4 {
	
	public static void main(String[] args) {
		
		int inntekt = Integer.parseInt(showInputDialog("Skriv inn din bruttoinntekt: "));
		double trinnskatt0 = 0.00;
		double trinnskatt1 = 0.019;
		double trinnskatt2 = 0.042;
		double trinnskatt3 = 0.132;
		double trinnskatt4 = 0.162;
		
		double inntekt1 = 180800.00;
		double inntekt2 = 254500.00;
		double inntekt3 = 639750.00;
		double inntekt4 = 999550.00;
		
		double skatt = 0;
		
		
		
		// Trinn 0
		if (inntekt < inntekt1) {
			skatt = (inntekt * trinnskatt0);
		}
		
		// Trinn 1
		if (inntekt >= inntekt1 && inntekt < inntekt2) {
			skatt = ((inntekt - inntekt1) * trinnskatt1);
		}
		
		// Trinn 2
		if (inntekt >= inntekt2 && inntekt < inntekt3) {
			skatt = ((inntekt - inntekt2) * trinnskatt2) + ((inntekt2 - inntekt1) * trinnskatt1);
		}
		
		// Trinn 3
		if (inntekt >= inntekt3 && inntekt < inntekt4) {
			skatt = ((inntekt - inntekt3) * trinnskatt3) + ((inntekt3 - inntekt2) * trinnskatt2) + ((inntekt2 - inntekt1) * trinnskatt1);
		}
		
		// Trinn 4
		if (inntekt >= inntekt4) {
			skatt = ((inntekt - inntekt4) * trinnskatt4) + ((inntekt4 - inntekt3) * trinnskatt3) + ((inntekt3 - inntekt2) * trinnskatt2) + ((inntekt2 - inntekt1) * trinnskatt1);
		}
		
		showMessageDialog(null, "Med inntekt på " + inntekt + "kr vil du få en skatt på " + (int)skatt + "kr.");
		
	}

}
