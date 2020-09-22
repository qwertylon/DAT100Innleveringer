package no.hvl.dat100;

public class Oppgave4 {

	public static void main(String[] args) {
		
		// Oppgave a)
		int a = 11, b = 5, c = 92;
		System.out.println(minst(a, b, c));
		
	}
	
	// Oppgave b)
	public static int minst(int a, int b, int c) {
		
		int minst = a;
		
		if (b < minst) {
			minst = b;
		}
		if (c < minst) {
			minst = c;
		}
		
		return minst;
	}

}