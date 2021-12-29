public class Saldolaskuri {
    public static void main(String[] args) {        
               
        double minuutit = 428.5; //Puhutut minuutit.
        int tekstiviestit = 36; //Lähetetyt tekstiviestit

        double minuuttihinta = 0.069;   //Euroa per minuutti.
        double tekstiviestihinta = 0.069;   //Euroa per tekstiviesti. 

        double laskettuMinuuttihinta = minuutit * minuuttihinta;    //428.5 * 0.069.
        double laskettuTekstiviestihinta = tekstiviestit * tekstiviestihinta;   //36 * 0.069.

        double yhteishinta = laskettuMinuuttihinta + laskettuTekstiviestihinta;
        
        System.out.println("Puhelinlaskun hinta: "+yhteishinta+" euroa."); 
    }    
}