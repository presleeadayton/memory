package memory.enums;

public enum HelpMenuEnums {
    B ("Board Help"),
    G ("Game Help"), 
    C ("Card Help"), 
    S ("Score Help"), 
    H ("How to Play Menu"),
    CM ("Card Menu"),
    BM ("Board Menu"),
    Q ("Quit Menu");
            
    String message;
    
    private HelpMenuEnums(String message) {
        this.message = message;
    }

    public String getHelpText() {
        return message;
    }
}
