package org.ob11to;

import org.ob11to.exceptions.AccountIsLockedException;
import org.ob11to.exceptions.IncorrectlyEnteredThePinCodeException;
import org.ob11to.interfaces.PinValidator;

import java.util.Date;

public class PinValidatorImpl implements PinValidator {
    private final int pinCodeClient = 1111;  //пин код клиента
    private int pinError;  //ошибочный пин
    private long dateError;  //временная дата для ошибки


    @Override
    public void verifyPin(int clientIdPin) throws AccountIsLockedException, IncorrectlyEnteredThePinCodeException{
        Date dateNow = new Date();  // берем новое время

        if(pinError >= 3){
            dateError = new Date().getTime() + 5000;
            pinError = 0;
            throw new AccountIsLockedException();
        }
        if (dateError > dateNow.getTime()) {
            long l = dateError - dateNow.getTime();
            throw new AccountIsLockedException(l);
        }

        if (pinCodeClient != clientIdPin) { //проверка на пин код
            pinError++;
            throw new IncorrectlyEnteredThePinCodeException(); //бросаем исключение, что пин код не верен
        }

    }

    @Override
    public int getCountPinError() {
            return pinError;
    }

    @Override
    public long getBankAccountPin() {
        return dateError;
    }
}
