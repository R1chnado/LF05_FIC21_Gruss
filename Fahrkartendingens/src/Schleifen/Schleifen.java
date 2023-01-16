package Schleifen;

public class Schleifen {

	public static void main(String[] args) {
		
		for(int i=10; i<=20; i=i+1) {
		      System.out.printf("%d ", i*i);
		}
		
		System.out.println("");
		
		int i = 10;
		while(i <= 20) {
		     System.out.printf("%d ", i*i);
		     i = i+1;
		     if (i == 18) break;

		     if (i == 11) continue;
		}

	}

}
