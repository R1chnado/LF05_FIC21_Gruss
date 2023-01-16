package Noten;

import java.util.Scanner;

public class Noten {
	public static void main(String[] args) {
		
		int Nummer;
	
		Scanner tastatur = new Scanner(System.in);
		
		while (true) {

		System.out.print("Bitte geben Sie eine Zahl ein: ");
		Nummer = tastatur.nextInt();
		
		switch (Nummer) {
		case 1: {
			System.out.println("Sehr gut!");
			break;
		}
		case 2: {
			System.out.println("Gut!");
			break;
		}
		case 3: {
			System.out.println("Befriedigend");
			break;
		}
		case 4: {
			System.out.println("Ausreichend");
			break;
		}
		case 5: {
			System.out.println("Mangelhaft");
			break;
		}
		case 6: {
			System.out.println("Ungenügend");
			break;
		}
		}
		
	}}
}
