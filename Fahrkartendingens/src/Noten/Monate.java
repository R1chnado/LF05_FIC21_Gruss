package Noten;

import java.util.Scanner;

public class Monate {
public static void main(String[] args) {
	
	int Nummer;
	
	Scanner tastatur = new Scanner(System.in);
	
	while (true) {

	System.out.print("Geben Sie eine Zahl ein: ");
	Nummer = tastatur.nextInt();
	
	switch (Nummer) {
	case 1: {
		System.out.println("Januar");
		break;
	}
	case 2: {
		System.out.println("Februar");
		break;
	}
	case 3: {
		System.out.println("März");
		break;
	}
	case 4: {
		System.out.println("April");
		break;
	}
	case 5: {
		System.out.println("Mai");
		break;
	}
	case 6: {
		System.out.println("Juni");
		break;
	}
	case 7: {
		System.out.println("Juli");
		break;
	}
	case 8: {
		System.out.println("August");
		break;
	}
	case 9: {
		System.out.println("September");
		break;
	}
	case 10: {
		System.out.println("Oktober");
		break;
	}
	case 11: {
		System.out.println("November");
		break;
	}
	case 12: {
		System.out.println("Dezember");
		break;
	}
	
}}
	
}
}
