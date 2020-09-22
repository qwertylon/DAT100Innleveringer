package no.hvl.dat100;

public class Oppgave5 {

	public static void main(String[] args) {
		
		System.out.println(arealAvSirkel(1.5));

	}
	
	public static double arealAvSirkel(double radius) {
		
		double areal = Math.PI * radius * radius;
		return areal;
	}

}