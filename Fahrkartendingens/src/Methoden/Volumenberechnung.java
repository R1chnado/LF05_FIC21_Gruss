package Methoden;

import java.util.Scanner;

public class Volumenberechnung {

	public static void main(String[] args) {
		while(true) {
		//Initialisierung
		int seite;
		int volumen;
		Scanner tastatur = new Scanner(System.in);
		
		//Eingabe
		System.out.println("Bitte geben Sie den Wert einer Seite an:");
		seite = tastatur.nextInt();
		
		//Verarbeitung
		volumen = volumen(seite);
		
		//Ausgabe
		System.out.println("Das Volumen beträgt: " + volumen);
	}}
	private static int volumen(int seite) {
		
		return seite*seite*seite;
	}

}
