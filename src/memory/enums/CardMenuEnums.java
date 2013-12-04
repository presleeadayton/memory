package memory.enums;

public enum CardMenuEnums {
    I ("Card Images"),
    L ("Card Letters"), 
    N ("Card Numbers"), 
    B ("Board Menu"), 
    H ("Help Menu"),
    Q ("Quit Menu");
            
    String message;
    
    private CardMenuEnums(String message) {
        this.message = message;
    }

    public String getHelpText() {
        return message;
    }
}
