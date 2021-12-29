import java.time.Clock;
import java.time.Year;

public class Vuosi { 
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        Year vuosi = Year.now(clock);
        System.out.println("Nyt on vuosi "+vuosi); 
    }
}