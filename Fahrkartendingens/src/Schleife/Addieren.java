package Schleife;

import java.util.Scanner;

public class Addieren {

	public static void main(String[] args) {
		
		int n = 0;
		int Summe = 0;
		Scanner tastatur = new Scanner(System.in);
		
		System.out.print("\nGeben Sie n ein: ");
		n = tastatur.nextInt();
		
		System.out.println("\nHier sind die Zahlen:");
		
		for(int i = 1;i<=n;i++){
			
			System.out.println(i);
			Summe = Summe + i;
			
		}
		System.out.println("\nSumme: " + Summe);
		tastatur.close();
	}

}
