package com.tdd.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.tdd.example.LueJaOtaSelvaa.vertailuVaihtoehdot;

public class LueJaOtaSelvaa {
		

	private String koordinaattivertailu;
	private String LueTiedostot;	
	//private int X;
	//private int Y;

	/*public LueJaOtaSelvaa(String koordinaattiPiste) {
		this.koordinaattiPiste = koordinaattiPiste;
		
	}*/
	
	public void LueTiedostot() {		
		try {
			File tiedostoOlio1 = new File("polygoni.txt");
			Scanner lukijaOlio = new Scanner(tiedostoOlio1);			
			while (lukijaOlio.hasNextLine()) {				
				String tiedostoSisalto = lukijaOlio.nextLine();
				System.out.println(tiedostoSisalto);
			}
			lukijaOlio.close();
		}catch(FileNotFoundException e) {
			System.out.println("Tapahtui virhe. Tiedostoa ei löytynyt.");
			e.printStackTrace();
		}
		
		System.out.println("");
		
		try {
			File tiedostoOlio1 = new File("pisteet.txt");
			Scanner lukijaOlio = new Scanner(tiedostoOlio1);
			while (lukijaOlio.hasNextLine()) {				
				String tiedostoSisalto = lukijaOlio.nextLine();
				System.out.println(tiedostoSisalto);
			}
			lukijaOlio.close();
		}catch(FileNotFoundException e) {
			System.out.println("Tapahtui virhe. Tiedostoa ei löytynyt.");
			e.printStackTrace();
		}
	}
	
	enum vertailuVaihtoehdot {
		
	}
	 public static void main(String[] args) {
		 
	 }
	
	public void vertailuVaihtoehdot() {
		//Vertaile polygonin X:iä pisteiden X:iin.
		//Vertaile polygonin Y:itä pisteiden Y:ihin.
		double x0 = 0.0, x1 = 0.0;
		double y0 = 0.0, y1 = 0.0;
		/*
		 * Silloin koordinaatit ovat polygonin reunaviivan päällä,
		 * kun x0 = 2, niin y0 = välillä 2 ja 4.
		 * kun x1 = 4, niin y1 = välillä 2 ja 5
		 * kun y0 = 2, niin x0 = välillä 2 ja 4
		 * kun y1 = 0.5, niin x1 = välillä 2 ja 4.
		 * Muissa tapauksissa ne ovat polygonin sisäpuolella tai ulkopuolella. 
		 * */		
		/*switch(olio1) {
		case KOORDINAATITULKOPUOLELLA:
			System.out.println("Koordinaatit ovat polygonin ulkopuolella.");
			break;
		case KOORDINAATITSISAPUOLELLA:
			System.out.println("Koordinaatit ovat polygonin sisäpuolella.");
			break;
		case KOORDINAATITPAALLEKKAIN:
			System.out.println("Koordinaatit ovat polygonin kanssa päällekkäin.");
			break;
		}*/
	if(x0 == 2.0 && y0 == 2.0 || y0 <=4.0 ) {
			System.out.println("x0 == 2.0 && y0 == 2.0 || y0 <=4.0 1a ");
		}else if(x1 == 4.0 && y1 == 2.0 || y1 <=5.0 ){
			System.out.println("x1 == 4.0 && y1 == 2.0 || y1 <=5.0");			
		}else if(y0 < 2.0 && x0 == 2.0 || x1 <=4.0 ){
			System.out.println("y0 < 2.0 && x0 == 2.0 || x1 <=4.0");			
		}else if(y1 == 0.5 && x1 == 2.0 || x1 <=4.0 ){
			System.out.println("y1 == 0.5 && x1 == 2.0 || x1 <=4.0 ");			
		}else {
			System.out.println("Koordinaatit eivät ole polygonin päällä.");			
		}	
	}
}
