package org.ob11to.interfaces;

/**
 * Интерфейс для проверки Pin
 */
public interface PinValidator {

    void verifyPin(int clientIdPin); //функция проверки пин

    void getCountPinError();  //??

    void getBankAccountPin();  //??
}
