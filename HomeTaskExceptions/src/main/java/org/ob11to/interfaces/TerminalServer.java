package org.ob11to.interfaces;

import org.ob11to.exceptions.NotEnoughMoneyException;
import org.ob11to.exceptions.WrongAmountOfMoneyException;

/**
 * Интерфейс для проверки ввода и выводы денег
 */
public interface TerminalServer {

    int putMoney(int allMoney) throws WrongAmountOfMoneyException;

    int getMoney(int allMoney) throws NotEnoughMoneyException, WrongAmountOfMoneyException;;

    long checkBalance();
}
