/*
 * Tässä tehtävässä käytetään perintää.
 * Henkilö-luokka perii ominaisuuksia ja 
 * toiminnallisuuksia Immeinen-luokasta.
 * Henkilö-luokasta luodaan olioita julkisessa
 * Ihminen-luokassa.
 * */

import java.util.Scanner;

class Immeinen {
	int ikä;
	double paino;
	String ihonväri;
	String kansalaisuus;
	String sukupuoli;	
	String sanonta;
	
	void tervehdi(){
        System.out.println(sanonta);
    }
	
	public Immeinen() {		
	}
	
	public Immeinen(int ikä, double paino, String ihonväri, String kansalaisuus, String sukupuoli, String sanonta){
        this.ikä = ikä;
        this.paino = paino;
        this.ihonväri = ihonväri;
        this.kansalaisuus = kansalaisuus;
        this.sukupuoli = sukupuoli;
        this.sanonta = sanonta;
	}
	
	void kerroTiedot(){
        System.out.println("Ikä: " + this.ikä);
        System.out.println("Paino: " + this.paino);       
        System.out.println("Ihonväri: " + this.ihonväri);
        System.out.println("Kansalaisuus: " + this.kansalaisuus);
        System.out.println("Sukupuoli: " + this.sukupuoli);        
    }
	
}

class Henkilö extends Immeinen{
	private String etunimi;
	private String sukunimi;
	private String sossu;
	
	public Henkilö(int ikä, double paino, String ihonväri, String kansalaisuus, String sukupuoli, String sanonta, String etunimi, String sukunimi, String sossu) {
        super(ikä,paino,ihonväri,kansalaisuus,sukupuoli,sanonta);        
        this.etunimi = etunimi;  
        this.sukunimi = sukunimi;
        this.sossu = sossu;
    }
	
	public Henkilö() {
		
	}	
	
	public void kerroTiedot(){
		System.out.println("Etunimi: " + this.etunimi);
		System.out.println("Sukunimi: " + this.sukunimi);
        System.out.println("Ikä: " + this.ikä);
        System.out.println("Sossu: " + this.sossu);
        System.out.println("Paino: " + this.paino);       
        System.out.println("Ihonväri: " + this.ihonväri);
        System.out.println("Kansalaisuus: " + this.kansalaisuus);
        System.out.println("Sukupuoli: " + this.sukupuoli);        
    }
	
	public void tervehdi(){
        System.out.println("Hän sanoo: "+sanonta);
    }
}

public class Ihminen{
	public static void main(String[] args) {
		//Luodaan ihmisolioita luokista.
		Immeinen yksi = new Immeinen(28, 80.2, "vaaleanruskea", "englantilainen", "nainen", "Hello! ");
		Henkilö henkilö1 = new Henkilö(29, 80.2, "ruskea", "intialainen", "mies", "Namashte!", "Amar", "Ghuru", "170992-1432");
		Henkilö henkilö2 = new Henkilö(31, 69.9, "vaaleankellanruskea", "japanilainen", "nainen", "Konnichiwa!", "Kinu", "Nakamoto", "170990A7238X");

		Henkilö joku = new Henkilö(); 
		
		yksi.kerroTiedot();
		yksi.tervehdi(); 
		
		System.out.println("");
						
		henkilö1.kerroTiedot();
		henkilö1.tervehdi();
		
		System.out.println("");
				
		henkilö2.kerroTiedot();
		henkilö2.tervehdi();
	}	
	
}
