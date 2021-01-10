package org.ob11to;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TerminalImpl terminal = new TerminalImpl();

            Scanner console = new Scanner(System.in);
            int pin = console.nextInt();
            terminal.putPin(pin);


    }
}
