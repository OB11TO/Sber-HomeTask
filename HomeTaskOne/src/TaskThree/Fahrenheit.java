package TaskThree;

public class Fahrenheit extends Conver {
    private static final String NAME = "Fahrenheit";
    private double celsius;

    public Fahrenheit(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public double getConver(){
        return celsius * 1.8 + 32;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getRadius() {
        return celsius;
    }

    public void setRadius(double celsius) {
        this.celsius = celsius;
    }
}
