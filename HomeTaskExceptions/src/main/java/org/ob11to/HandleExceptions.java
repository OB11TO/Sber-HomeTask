package org.ob11to;

import org.ob11to.exceptions.*;

public class HandleExceptions {
    public static String handleException(Exception e){
        String messege = "";
        if ((e instanceof AccountIsLockedException) && (0L != ((AccountIsLockedException) e).getMillisecond())) {
            messege = "AccountIsLockedException - Счет был заблокирован. " + ((AccountIsLockedException) e).getMillisecond() + " milliseconds.";
        }
        if ((e instanceof AccountIsLockedException) && (0L == ((AccountIsLockedException) e).getMillisecond())) {
            messege = "AccountIsLockedException - Ваш аккаунт в блокировке.";
        }
        if (e instanceof IncorrectlyEnteredThePinCodeException) {
            messege = "IncorrectPinCodeException - Вы ввели неверный PIN-Code.";
        }
        if (e instanceof WrongAmountOfMoneyException) {
            messege = "IncorrectAmountOfMoneyException - Сумма денег не кратна 100.";
        }
        if (e instanceof NotEnoughMoneyException) {
            messege = "NotEnoughMoneyException - На счету не хватает наличных.";
        }
       /* if (e instanceof PinCodeIsNotEnteredException) {
            messege = "PinCodeIsNotEnteredException - Вы не ввели PIN-Code. Введите PIN-Code, а затем повторите попытку.";
        }*/

        return messege;
    }
}
