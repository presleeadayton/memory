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
    private CardMenuControl cardMenuControl = new CardMenuControl();
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    private BoardMenuControl boardMenuControl = new BoardMenuControl();
    
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
                    this.boardMenuControl.pauseGame();
                    break;
                case "R":
                    this.boardMenuControl.restartGame();
                    break;
                case "C":
                    cardMenuControl.displayCardMenu();
                    break;
                case "H":
                    boardMenuControl.displayHelpMenu();
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