package Noten;

import java.util.Scanner;

public class Taschenrechner {
public static void main(String[] args) {
	
	Scanner tastatur = new Scanner(System.in);
	
	double Zahl1;
	double Zahl2;
	char oper;
	
	while(true) {
	
	System.out.print("\nGib 1. Zahl: ");
	Zahl1 = tastatur.nextDouble();
			
	System.out.print("Gib 2. Zahl: ");
	Zahl2 = tastatur.nextDouble();
	
	System.out.print("Gib Operator: ");
	oper = tastatur.next().charAt(0);
	
	switch (oper) {
	case '+': {
		
		System.out.print("Dein Ergebnis: " + (Zahl1 + Zahl2));
		break;
	}
	case '-': {
	
		System.out.print("Dein Ergebnis: " + (Zahl1 - Zahl2));	
		break;
	}
	case '*':{
		
		System.out.print("Dein Ergebnis: " + (Zahl1 * Zahl2));
		break;
	}
	case '/':{
		
		System.out.print("Dein Ergebnis: " + Math.round((Zahl1 / Zahl2)*100)/100.00);
		break;
	}
	}
	
}
}}
