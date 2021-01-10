package org.ob11to;

import java.util.Scanner;
import org.ob11to.interfaces.Terminal;


public class Main {
    private static Scanner console;
    private static Terminal terminal;



    public static void main(String[] args) {
        terminal = new TerminalImpl();
        console = new Scanner(System.in);
        while(true) {
            System.err.println("Введите PIN-Code");
            int pin = console.nextInt();
            if(pin != 1111){
                terminal.putPin(pin);
            }
            if(pin == 1111) {
                terminal.putPin(pin);
                break;
            }
        }

            int i = 0;
             while(i != 4){
            System.err.println("\nВыберите действия ");
            System.err.println("1) Снять деньги");
            System.err.println("2) Внести деньги");
            System.err.println("3) Проверить баланс ");
            System.err.println("4) Зверишить работу. ");
            System.err.println();
            int count = console.nextInt();
            switch (count) {
                case 1:
                    checkPutSum();
                    break;
                case 2:
                    terminal.getMoney(100);
                    break;
                case 3:
                    terminal.checkBalance();
                    break;
                case 4:
                    i = 4;
                    System.err.println("Спасибо! Всего хорошего!");
                default:
                    break;
            }
        }
    }

    private static void checkPutSum() {
        terminal = new TerminalImpl();
        console = new Scanner(System.in);
        System.out.println("Введите сумму: ");
        int count = console.nextInt();
        terminal.putMoney(count);
    }
}
