package br.com.game.gourmetPlay.expection;

public class DishNotNullException extends RuntimeException {

    public DishNotNullException() {
    }

    public DishNotNullException(String message) {
        super(message);
    }

    public DishNotNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public DishNotNullException(Throwable cause) {
        super(cause);
    }

    public DishNotNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}



