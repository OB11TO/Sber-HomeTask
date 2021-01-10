package org.ob11to.exceptions;

/**
 *  Создает исключение при попытке ввести PIN-код во время блокировки учетной записи.
 */

public class AccountIsLockedException extends Exception {
    private long millisecond;

    public long getMillisecond() {

        return millisecond;
    }

    public AccountIsLockedException() {}

    public AccountIsLockedException(long millisecond) {

        this.millisecond = millisecond;
    }
}
