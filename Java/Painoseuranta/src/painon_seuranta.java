import java.util.Arrays;
import java.util.Scanner;

public class painon_seuranta {
	public static void main(String[] args) {
		int i = 0;
        int suurin_paino = 0;
        int pienin_paino = 1000;
        int paino = 0;
        double summa = 0;
        int[] painotaulukko = new int[7];  //kokonaislukutaulukko
       
        
        try (Scanner lukija = new Scanner(System.in)) {
			for (i = 0; i < 7; i++){
			    System.out.println("Anna " + (i+1) + " p�iv�n paino kiloissa");
			    paino = lukija.nextInt();
			    
			    painotaulukko[i] = paino;
			    
			    if (paino > suurin_paino){
			        suurin_paino = paino;
			    }
			    if (paino < pienin_paino){
			        pienin_paino = paino;
			    }
			    summa += paino;
			}
		}
        
        Arrays.sort(painotaulukko); //Saattaa taulukon elementit pienimmästä suurimpaan taulukossa.
        /*System.out.println("Antamieni painojen summa on: " + summa);*/
        System.out.println("Painojen keskiarvo on: " + summa/7);
        System.out.println("Suurin paino on: " + suurin_paino);
        System.out.println("Pienin paino on: "+ pienin_paino);
        System.out.println("Painot j�rjestyksess� pienimm�st� suurimpaan: ");
        
        for (i = 0; i < 7; i++){
            System.out.println(painotaulukko[i]);
        }
        

	}

}
