package memory.customExceptionClasses;

public class CardMenuException extends Exception {

 
    public CardMenuException() {
    }

    public CardMenuException(String msg) {
        super(msg);
    }
    
    public CardMenuException(String message, Throwable cause) {
        super(message, cause);
    }

    public CardMenuException(Throwable cause) {
        super(cause);
    }
}
