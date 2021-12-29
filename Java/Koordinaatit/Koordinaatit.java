/**
 * Koordinaatit
 */
public class Koordinaatit {

    public static void main(String[] args) {
        int x1 = 1, y1 = 1, x2 = 5, y2 = 5; 
        double etaisyys = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));      
        System.out.println("Kahden pisteen välinen etäisyys on: " +etaisyys);
      }
  
}
