/**
 * Kolmio
 */
public class Kolmio {

    public static void main(String[] args) {
        //Kolmion sivujen pituudet.
        double a = 3.1;
        double b = 3.2;
        double c = 3.3;

        double s = (a+b+c)/2;   //S on puolet kolmion piiristä.

        double ala = Math.sqrt(s*(s-a)*(s-b)*(s-c));    //Kolmion pinta-ala.

        System.out.println("Piirin puolikas on: "+s);
        System.out.println("Kolmion pinta-ala on: "+ala);
    }
}
