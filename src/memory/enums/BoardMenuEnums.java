package memory.enums;

public enum BoardMenuEnums {
    P ("Pause Game"),
    R ("Restart Game"), 
    C ("Change Card Type"), 
    H ("Help Menu"), 
    Q ("Quit Menu");
    
    String message;
    
    private BoardMenuEnums(String message) {
        this.message = message;
    }

    public String getHelpText() {
        return message;
    }
}
