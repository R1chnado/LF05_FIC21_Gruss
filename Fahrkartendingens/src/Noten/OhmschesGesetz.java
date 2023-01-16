package Noten;
import java.util.Scanner;

public class OhmschesGesetz {
public static void main(String[] args) {
	
	Scanner tastatur = new Scanner(System.in);
	
	char Ergebnis;
	double R;
	double U;
	double I;
	
	System.out.print("\nGönn mal Buchstabe (R, U, I): ");
	Ergebnis = tastatur.next().charAt(0);
	
	if(Ergebnis != 'R'){
		
		System.out.print("Gönn mal R: ");
		
		
	}
	if(Ergebnis != 'U') {
		
		System.out.print("Gönn mal R: ");
		
	}
}

}
