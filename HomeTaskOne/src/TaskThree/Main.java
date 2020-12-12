package TaskThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input temperature value in Celsius: ");
        double celsius = Double.parseDouble(in.readLine());

        Conver[] convers = {
                new Fahrenheit(celsius),
                };

        for(Conver conver : convers)
            System.out.println(conver.getName() + ": temperature = " + conver.getConver());


    }
}
