package org.ob11to.interfaces;

/**
 * Интерфейс терминала
 */

public interface Terminal {

    void putPin(int pin);

    void putMoney(int allMoney);

    void getMoney(int allMoney);

    void checkBalance();
}
