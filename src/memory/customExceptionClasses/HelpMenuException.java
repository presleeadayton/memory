package memory.customExceptionClasses;

public class HelpMenuException extends Exception {

    public HelpMenuException() {
    }

    public HelpMenuException(String msg) {
        super(msg);
    }
    
    public HelpMenuException(String message, Throwable cause) {
        super(message, cause);
    }

    public HelpMenuException(Throwable cause) {
        super(cause);
    }
}
