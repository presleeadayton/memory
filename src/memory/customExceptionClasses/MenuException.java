package memory.customExceptionClasses;

public class MenuException extends Exception {

    public MenuException() {
    }

    public MenuException(String msg) {
        super(msg);
    }
    public MenuException(String message, Throwable cause) {
        super(message, cause);
    }

    public MenuException(Throwable cause) {
        super(cause);
    }
}
