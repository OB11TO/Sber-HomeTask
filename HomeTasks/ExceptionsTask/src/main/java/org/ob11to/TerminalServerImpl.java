package org.ob11to;

import org.ob11to.exceptions.NotEnoughMoneyException;
import org.ob11to.exceptions.WrongAmountOfMoneyException;
import org.ob11to.interfaces.TerminalServer;

public class TerminalServerImpl implements TerminalServer {
    private long balance = 1000;

    @Override
    public int putMoney(int allMoney) throws WrongAmountOfMoneyException {
        if(allMoney % 100 != 0){
            throw new WrongAmountOfMoneyException();
        }
        balance = balance + allMoney;
        return allMoney;
    }

    @Override
    public int getMoney(int allMoney) throws NotEnoughMoneyException, WrongAmountOfMoneyException{
        if(allMoney % 100 != 0){
            throw new WrongAmountOfMoneyException();
        }
        if(allMoney > balance){
            throw new NotEnoughMoneyException();
        }
        balance = balance - allMoney;
        return allMoney;
    }

    @Override
    public long checkBalance() {
        return balance;
    }
}
