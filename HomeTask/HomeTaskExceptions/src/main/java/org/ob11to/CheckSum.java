package org.ob11to;

import java.util.Scanner;

public class CheckSum extends Main{

    public  void checkSum(int num) {
        terminal = new TerminalImpl();
        console = new Scanner(System.in);

        System.out.println("Введите сумму: ");
        int count = console.nextInt();

        if(num == 1) {
            terminal.putMoney(count);
        }else{
            terminal.getMoney(count);
        }

    }

}
