package org.ob11to;

import org.ob11to.exceptions.AccountIsLockedException;
import org.ob11to.exceptions.IncorrectlyEnteredThePinCodeException;
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
            e.printStackTrace();
        }


    }

    @Override
    public void putMoney(int allMoney) {

    }

    @Override
    public void getMoney(int allMoney) {

    }

    @Override
    public void checkBalance() {

    }

}
