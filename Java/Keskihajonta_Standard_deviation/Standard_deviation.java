/**
 * Standard_deviation
 */
import java.text.DecimalFormat;
public class Standard_deviation {
    public static void main(String[] args) {
        double desimaali1 = 0.5;
        double desimaali2 = 1.0;
        double desimaali3 = 2.0;
        double desimaali4 = 3.0;
        double desimaali5 = 4.0;

        double keskiarvo = (desimaali1+desimaali2+desimaali3+desimaali4+desimaali5) / 5; //2.472.

        double devianssi1 = Math.pow(desimaali1-keskiarvo,2);   //(0.5 - 2.1)^2 = 2,56
        double devianssi2 = Math.pow(desimaali2-keskiarvo,2);
        double devianssi3 = Math.pow(desimaali3-keskiarvo,2);
        double devianssi4 = Math.pow(desimaali4-keskiarvo,2);
        double devianssi5 = Math.pow(desimaali5-keskiarvo,2);   

        double varianssi = (devianssi1+devianssi2+devianssi3+devianssi4+devianssi5) / 5;
        double keskihajonta = Math.sqrt(varianssi);

        System.out.println("Keskiarvo: " + keskiarvo);
        System.out.println("devianssi1: " + devianssi1 +", devianssi2: " + devianssi2 +", devianssi3: " + devianssi3 +", devianssi4: " + devianssi4 +", devianssi5: " + devianssi5);
        System.out.println("Varianssi: " + varianssi);
        System.out.println("Keskihajonta: " + keskihajonta);
        System.out.println("Uusi keskiarvo pyöristettynä: "+ Math.round(keskihajonta));
    }
}