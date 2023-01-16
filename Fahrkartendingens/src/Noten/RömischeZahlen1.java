package Noten;

import java.util.Scanner;

public class RömischeZahlen1 {

	public static void main(String[] args) {
	
		String Nummer;
		
		Scanner tastatur = new Scanner(System.in);
		
		while (true) {

		System.out.print("Bitte geben Sie eine Zahl ein: ");
		Nummer = tastatur.next();
		
		switch (Nummer) {
		case "I": {
			System.out.println("1");
			break;
		}
		case "V": {
			System.out.println("5");
			break;
		}
		case "X": {
			System.out.println("10");
			break;
		}
		case "L": {
			System.out.println("50");
			break;
		}
		case "C": {
			System.out.println("100");
			break;
		}
		case "M": {
			System.out.println("1000");
			break;
		}
		}
		
	}}

	}
