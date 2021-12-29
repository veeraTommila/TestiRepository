import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tyontekija {
    public static void main(String[] args) {
		String nimi = "Kalle Sörsselssön";
		double palkka = 3200.5;
		int ikä = 30;
		String osoite = "Kukkulakuja 3, 00010 Kukkulakaupunki";
		boolean lomalla = false;
		
		LocalDateTime syntymäAika = LocalDateTime.now();
		DateTimeFormatter syntymäAjanMuoto = DateTimeFormatter.ofPattern("31-11-1991 01:00:22");
		String muotoiltuPäivämäärä = syntymäAika.format(syntymäAjanMuoto);		
				
		System.out.println("Nimi: " + nimi);
		System.out.println("palkka: " + palkka);
		System.out.println("ikä: " + ikä);
		System.out.println("Syntymäaika: " + muotoiltuPäivämäärä);
		System.out.println("Osoite: " + osoite);
		System.out.print("Onko työntekijä lomalla?");		
		
		if(lomalla == true) {
			System.out.println(" "+ nimi + " on lomalla.");
		}else {
			System.out.println(" "+ nimi + " on töissä.");
		}                                              		
	} 
}
