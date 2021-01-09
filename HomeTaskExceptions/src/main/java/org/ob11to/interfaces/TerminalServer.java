package org.ob11to.interfaces;

/**
 * Интерфейс для проверки ввода и выводы денег
 */
public interface TerminalServer {

    void putMoney(int allMoney);

    void getMoney(int allMoney);

    void checkBalance();
}
