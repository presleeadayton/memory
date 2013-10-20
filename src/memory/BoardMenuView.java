package memory;

import java.util.Scanner;

/**
 *
 * @author nathaniallarson
 */
public class BoardMenuView {
    
    private final static String[][] menuItems = {
        {"P", "Pause Game"}, 
        {"R", "Restart Game"},
        {"C", "Change Card Type"},
        {"H", "Help Menu"}, 
        {"Q", "Quit Menu"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private BoardMenuControl BoardMenuControl = new BoardMenuControl();
    private CardMenuView CardMenuView = new CardMenuView();
    private HelpMenuView HelpMenuView = new HelpMenuView();
    // default constructor
    public BoardMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public String getInput() {       
        
        String gameStatus = "PLAYING";
        do {
            this.display();
            
            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "P":
                    this.BoardMenuControl.pauseGame();
                    break;
                case "R":
                    this.BoardMenuControl.restartGame();
                    break;
                case "C":
                    this.CardMenuView.getInput();
                    break;
                case "H":
                    this.HelpMenuView.getInput();
                    break;
                case "Q": 
                    return "QUIT";
            }
        } 
        while (!gameStatus.equals("QUIT"));  
        
         return gameStatus;
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < BoardMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

 
    // retrieves the command entered by the end user
    protected final String getCommand() {

        Scanner inFile = new Scanner(System.in);
        String command;
        boolean valid = false;
        do {

            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!valid) {
                new MemoryError().displayError("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }
     
    
    // determines if the command is valid
    private boolean validCommand(String command) {
        String[][] items = BoardMenuView.menuItems;

        for (String[] item : BoardMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    
} 