public class Puhelu {
    private double kesto;
    private double minuuttihinta;

    //Parametrillinen muodostin.
    public Puhelu(double kesto, double minuuttihinta){
        setKesto(kesto);
        setMinuuttihinta(minuuttihinta);
    }
    public double getKesto(){
        return kesto;
    }
    public double getMinuuttihinta(){
        return minuuttihinta;
    }
}
