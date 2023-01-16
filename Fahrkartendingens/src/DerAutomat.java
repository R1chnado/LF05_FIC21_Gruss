import java.util.Scanner;

class DerAutomat {
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);





		double eingezahlterGesamtbetrag;
		
		double zuZahlenderBetrag;



		// 1 Geldbetrag eingeben
		begruessung();
		zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur);
		System.out.println("Zwichenbetrag: "+zuZahlenderBetrag +" Euro");
		// 2 Geldeinwurf
		eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur,zuZahlenderBetrag);
		
		
		// 3 Fahrscheinausgabe
		fahrkartenAusgeben();
		
		
		// 4 Rückgeldberechnung und -ausgabe
		rueckgeldAusgeben(zuZahlenderBetrag, eingezahlterGesamtbetrag);

		System.out.println("\nVergessen Sie nicht, die Fahrscheine\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");

		tastatur.close();
	}
	public static void begruessung() {
		System.out.println("Herzlich Willkommen!");
	}
	public static double fahrkartenbestellungErfassen(Scanner tastatur) {
		
		double zuZahlenderBetrag = 0;
		int wahl;
		boolean pay = false;
		double AnzahlTickets = 0;
		double ticketpreis = 0;
		
		while(pay==false) {
		System.out.println("Wählen Sie Ihre Wunschfahrkarte für Berlin AB aus:");
		
		System.out.println("Kurzstrecke AB [2,00 EUR] (1)");
		System.out.println("Einzelfahrschein AB [3,00 EUR] (2)");
		System.out.println("Tageskarte AB [8,80 EUR] (3)");
		System.out.println("4-Fahrten-Karte AB [9,40 EUR] (4)");
		System.out.println("Bezahlen (9)");
		
		System.out.print("Ihre Wahl:");
		wahl = tastatur.nextInt();
		
		while(wahl<1||wahl>4&&!(wahl==9)) {
			
			System.out.println("Bitte wählen Sie eine Zahl zwischen 1 und 4.");
			wahl = tastatur.nextInt();
			
		};
		
		if(wahl!=9) {
		System.out.print("Anzahl der Tickets: ");
		AnzahlTickets = tastatur.nextDouble();
		
		while(AnzahlTickets<0||AnzahlTickets>10){

			System.out.print("Anzahl der Tickets ist ungültig. Abgabe nur in haushaltsüblichen Mengen. Wählen Sie eine Zahl zwischen 1 und 10.");
			System.out.print("\nAnzahl der Tickets: ");
			AnzahlTickets = tastatur.nextDouble();
			
		};
		};
		
		switch(wahl) {
		case 1:
			ticketpreis = 2;
			break;
		case 2:
			ticketpreis = 3;
			break;
		case 3:
			ticketpreis = 8.80;
			break;
		case 4:
			ticketpreis = 9.40;
			break;
		case 9:
			pay = true;
			return zuZahlenderBetrag;
		}
		zuZahlenderBetrag = zuZahlenderBetrag + ticketpreis * AnzahlTickets;
		};
		
		return zuZahlenderBetrag;
	}
	
public static double fahrkartenBezahlen(Scanner tastatur,double zuZahlenderBetrag) {
	
	double eingezahlterGesamtbetrag;
	double nochZuZahlen;
	double rueckgabebetrag;
	double eingeworfeneMuenze;
	String eingeworfeneMuenze2;
	
	eingezahlterGesamtbetrag = 0.0;
	nochZuZahlen = 0.0;
//	zuZahlenderBetrag = zuZahlenderBetrag * AnzahlTickets;
	zuZahlenderBetrag = Math.round(zuZahlenderBetrag *100) /100.0;
	while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
		nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
		//nochZuZahlen = Math.round(nochZuZahlen * 100) / 100;
		
		nochZuZahlen = Math.round(nochZuZahlen*100);
		nochZuZahlen = nochZuZahlen / 100;
			
		System.out.printf("\nNoch zu zahlen: %.2f Euro",nochZuZahlen);
		System.out.print("\nEingabe (mind. 5 Cent, höchstens 20 Euro): ");
		eingeworfeneMuenze = tastatur.nextDouble();
		eingeworfeneMuenze2 = eingeworfeneMuenze + "";
		
		switch(eingeworfeneMuenze2) {
		case "0.05","0.1","0.2","0.5","1.0","2.0","5.0","10.0","20.0":
			eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			break;
		default:
			System.out.print("\nBitte kein Falschgeld einwerfen.");
		}
	};

	return eingezahlterGesamtbetrag;
}
public static void fahrkartenAusgeben() {
	System.out.println("\nFahrscheine werden ausgegeben");
	for (int i = 0; i < 30; i++) {
		System.out.print("=");
		try {
			Thread.sleep(100);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println("\n\n");
}
public static double rueckgeldAusgeben(double zuZahlenderBetrag, double eingezahlterGesamtbetrag) {
	double rueckgabebetrag;
	
	
	rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
	rueckgabebetrag = Math.round(rueckgabebetrag *100)/100.0;
	if (rueckgabebetrag > 0.00) {
		System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro ",rueckgabebetrag);
		System.out.println("wird in folgenden Münzen ausgezahlt:");
		
		muenzRueckgabe(rueckgabebetrag);

	}
	
	return rueckgabebetrag;
}
public static void muenzRueckgabe(double rueckgabebetrag) {
	rueckgabebetrag = rueckgabebetrag * 100;
	while (rueckgabebetrag >= 200) { // 2-Euro-Münzen
		System.out.println("2 Euro");
		rueckgabebetrag = rueckgabebetrag - 200;
	}
	while (rueckgabebetrag >= 100) { // 1-Euro-Münzen
		System.out.println("1 Euro");
		rueckgabebetrag = rueckgabebetrag- 100;
	}
	while (rueckgabebetrag >= 50) { // 50-Cent-Münzen
		System.out.println("50 Cent");
		rueckgabebetrag = rueckgabebetrag - 50;
	}
	while (rueckgabebetrag >= 20) { // 20-Cent-Münzen
		System.out.println("20 Cent");
		rueckgabebetrag = rueckgabebetrag - 20;
	}
	while (rueckgabebetrag >= 10) { // 10-Cent-Münzen
		System.out.println("10 Cent");
		rueckgabebetrag = rueckgabebetrag - 10;
	}
	while (rueckgabebetrag >= 5) { // 5-Cent-Münzen
		System.out.println("5 Cent");
		rueckgabebetrag = rueckgabebetrag - 5;
	}
}
}