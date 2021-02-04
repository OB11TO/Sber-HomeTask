package org.ob11to;

import java.util.Scanner;
import org.ob11to.interfaces.Terminal;


public class Main {
    public static Scanner console;
    public static Terminal terminal;


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
            System.err.println("1) Внести деньги");
            System.err.println("2) Снять деньги");
            System.err.println("3) Проверить баланс ");
            System.err.println("4) Завершить работу. ");
            System.err.println();
            int count = console.nextInt();
            CheckSum sum = new CheckSum();
            switch (count) {
                case 1:
                    sum.checkSum(1);
                    break;
                case 2:
                    sum.checkSum(2);
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
}
