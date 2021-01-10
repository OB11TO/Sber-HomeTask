package org.ob11to;

import org.ob11to.exceptions.*;
import org.ob11to.interfaces.PinValidator;
import org.ob11to.interfaces.Terminal;
import org.ob11to.interfaces.TerminalServer;

public class TerminalImpl implements Terminal {
    private final TerminalServer server = new TerminalServerImpl();
    private final PinValidator pinValidator = new PinValidatorImpl();
    private  boolean access = false;


    public TerminalServer getServer() {
        return server;
    }

    public PinValidator getPinValidator() {
        return pinValidator;
    }

    public boolean isAccess() {
        return access;
    }

    @Override
    public void putPin(int pin)  {
        try {

            pinValidator.verifyPin(pin); // отправка пина для проверки
            access = true;
            System.err.println("Верный PIN-код.");

        } catch (AccountIsLockedException | IncorrectlyEnteredThePinCodeException e) {
            System.err.println(HandleExceptions.handleException(e));
        }


    }

    @Override
    public void putMoney(int allMoney) {
        try {
            checkTerminalAccess();
            System.err.println("Сделка прошла успешно. Вы положили деньги в банковский счёт " +  server.putMoney(allMoney) +  " $");
        } catch (WrongAmountOfMoneyException |PinCodeIsNotEnteredException e) {
            System.err.println(HandleExceptions.handleException(e));
        }

    }


    @Override
    public void getMoney(int allMoney) {
        try {
            checkTerminalAccess();
            System.err.println("Сделка прошла успешно. Вы сняли деньги с банковского счета " +  server.getMoney(allMoney) +  " $");
        } catch (NotEnoughMoneyException | WrongAmountOfMoneyException | PinCodeIsNotEnteredException e) {
            System.err.println(HandleExceptions.handleException(e));

        }
    }

    @Override
    public void checkBalance() {
        try{
            checkTerminalAccess();
            System.err.println("Баланс вашего счета  " + server.checkBalance() +  " $");
        } catch (PinCodeIsNotEnteredException e) {
            System.err.println(HandleExceptions.handleException(e));
        }
    }

    private void checkTerminalAccess()throws PinCodeIsNotEnteredException {
        if(!access){
            throw new PinCodeIsNotEnteredException();
        }
    }

}
