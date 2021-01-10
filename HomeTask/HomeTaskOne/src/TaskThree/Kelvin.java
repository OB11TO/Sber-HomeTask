package TaskThree;

public class Kelvin extends Conver {
    private static final String NAME = "Kelvin";
    private double celsius;

    public Kelvin(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public double getConver(){

        return celsius + 273.15;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
