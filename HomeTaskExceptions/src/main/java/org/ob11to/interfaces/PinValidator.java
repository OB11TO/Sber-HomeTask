package org.ob11to.interfaces;

import org.ob11to.exceptions.AccountIsLockedException;
import org.ob11to.exceptions.IncorrectlyEnteredThePinCodeException;

/**
 * Интерфейс для проверки Pin
 */
public interface PinValidator {

    void verifyPin(int clientIdPin) throws AccountIsLockedException, IncorrectlyEnteredThePinCodeException; //функция проверки пин

    int getCountPinError();  //??

    long getBankAccountPin();  //??
}
