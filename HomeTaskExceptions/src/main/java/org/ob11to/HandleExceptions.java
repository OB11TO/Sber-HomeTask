package org.ob11to;

import org.ob11to.exceptions.*;

public class HandleExceptions {
    public static String handleException(Exception e){
        String messege = "";
        if ((e instanceof AccountIsLockedException) && (0L != ((AccountIsLockedException) e).getMillisecond())) {
            messege = "AccountIsLockedException - Счет был заблокирован. " + ((AccountIsLockedException) e).getMillisecond() + " milliseconds.";
        }

        return messege;
    }
}
