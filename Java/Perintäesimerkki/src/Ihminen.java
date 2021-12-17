/*
 * T�ss� teht�v�ss� k�ytet��n perint��.
 * Henkil�-luokka perii ominaisuuksia ja 
 * toiminnallisuuksia Immeinen-luokasta.
 * Henkil�-luokasta luodaan olioita julkisessa
 * Ihminen-luokassa.
 * */

import java.util.Scanner;

class Immeinen {
	int ik�;
	double paino;
	String ihonv�ri;
	String kansalaisuus;
	String sukupuoli;	
	String sanonta;
	
	void tervehdi(){
        System.out.println(sanonta);
    }
	
	public Immeinen() {		
	}
	
	public Immeinen(int ik�, double paino, String ihonv�ri, String kansalaisuus, String sukupuoli, String sanonta){
        this.ik� = ik�;
        this.paino = paino;
        this.ihonv�ri = ihonv�ri;
        this.kansalaisuus = kansalaisuus;
        this.sukupuoli = sukupuoli;
        this.sanonta = sanonta;
	}
	
	void kerroTiedot(){
        System.out.println("Ik�: " + this.ik�);
        System.out.println("Paino: " + this.paino);       
        System.out.println("Ihonv�ri: " + this.ihonv�ri);
        System.out.println("Kansalaisuus: " + this.kansalaisuus);
        System.out.println("Sukupuoli: " + this.sukupuoli);        
    }
	
}

class Henkil� extends Immeinen{
	private String etunimi;
	private String sukunimi;
	private String sossu;
	
	public Henkil�(int ik�, double paino, String ihonv�ri, String kansalaisuus, String sukupuoli, String sanonta, String etunimi, String sukunimi, String sossu) {
        super(ik�,paino,ihonv�ri,kansalaisuus,sukupuoli,sanonta);        
        this.etunimi = etunimi;  
        this.sukunimi = sukunimi;
        this.sossu = sossu;
    }
	
	public Henkil�() {
		
	}	
	
	public void kerroTiedot(){
		System.out.println("Etunimi: " + this.etunimi);
		System.out.println("Sukunimi: " + this.sukunimi);
        System.out.println("Ik�: " + this.ik�);
        System.out.println("Sossu: " + this.sossu);
        System.out.println("Paino: " + this.paino);       
        System.out.println("Ihonv�ri: " + this.ihonv�ri);
        System.out.println("Kansalaisuus: " + this.kansalaisuus);
        System.out.println("Sukupuoli: " + this.sukupuoli);        
    }
	
	public void tervehdi(){
        System.out.println("H�n sanoo: "+sanonta);
    }
}

public class Ihminen{
	public static void main(String[] args) {
		//Luodaan ihmisolioita luokista.
		Immeinen yksi = new Immeinen(28, 80.2, "vaaleanruskea", "englantilainen", "nainen", "Hello! ");
		Henkil� henkil�1 = new Henkil�(29, 80.2, "ruskea", "intialainen", "mies", "Namashte!", "Amar", "Ghuru", "170992-1432");
		Henkil� henkil�2 = new Henkil�(31, 69.9, "vaaleankellanruskea", "japanilainen", "nainen", "Konnichiwa!", "Kinu", "Nakamoto", "170990A7238X");

		Henkil� joku = new Henkil�(); 
		
		yksi.kerroTiedot();
		yksi.tervehdi(); 
		
		System.out.println("");
						
		henkil�1.kerroTiedot();
		henkil�1.tervehdi();
		
		System.out.println("");
				
		henkil�2.kerroTiedot();
		henkil�2.tervehdi();
	}	
	
}
