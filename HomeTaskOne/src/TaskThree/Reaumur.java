package TaskThree;

public class Reaumur extends Conver {
    private static final String NAME = "Reaumur";
    private double celsius;

    public Reaumur(double celsius){this.celsius = celsius; }

    @Override
    public double getConver(){
        return celsius * 4 / 5;
    }

    @Override
    public String getName(){
        return NAME;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

}
