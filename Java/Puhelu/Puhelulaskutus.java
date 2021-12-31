/**
 * Puhelulaskutus.
 * Tämä on sovellusluokka, siksi main-metodi on käytössä.
 */
public class Puhelulaskutus {

    public void laskeHinta(){
        Puhelu puhelu1 = new Puhelu(12.5, 0.069);

        System.out.println("Puhelun kesto: " + kesto);
        System.out.println("Puhelun hinta: " + minuuttiHinta);
    }
    public static void main(String[] args) {
        /**
         * Tämä on sovellusluokka.
         * Luodaan uusi Puhelu-olio ja sijoitetaan kestoksi 12,5 minuuttia. 
         * Lopuksi lasketaan ja tulostetaan puhelun hinta laskeHinta-metodia käyttäen.
         */
        Puhelulaskutus puhelu1 = new Puhelulaskutus();
        puhelu.laskeHinta();
    }
}
/**
 * Puhelu
 * Tämä on kohdeluokka. Siksi main-metodia ei ole.
 */
public class Puhelu {

    public class Puhelu {
        private double kesto;
        private double minuuttihinta;
    
        //Parametrillinen muodostin.
        public Puhelu(double kesto, double minuuttihinta){
            setKesto(kesto);
            setMinuuttihinta(minuuttihinta);
            minuuttihinta = 0.069;
        }
    
        //Get-metodit.
        public double getKesto(){
            return kesto;
        }
        public double getMinuuttihinta(){
            return minuuttihinta;
        }
    
        public void setKesto(){
            if(kesto > 0){
                this.kesto = kesto;
                System.out.println("Puhelun kesto oli "+kesto+" minuuttia.");
            }else{
                System.out.println("Puhelun kesto oli 0!");
            }
        }
    
        public double laskeHinta(){
            double puhelunHinta;        
            if(minuuttiHinta >= 0.069){
                puhelunHinta = minuuttiHinta + kesto;
            }else{
                System.out.println("Puhelun hintaa ei voitu laskea.");
            }
            return puhelunHinta;
        }
    }     
}

