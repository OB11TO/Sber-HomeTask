package org.ob11to;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TerminalImpl terminal = new TerminalImpl();
        int a = 0;

            Scanner console = new Scanner(System.in);
            int pin = console.nextInt();
            terminal.putPin(pin);


            terminal.putMoney(100);
            terminal.checkBalance();
        terminal.getMoney(100);


    }
}
