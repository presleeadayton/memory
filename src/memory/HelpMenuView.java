package memory;

import java.io.Serializable;
import java.util.Scanner;

public class HelpMenuView implements Serializable {
            
   
    private final static String[][] menuItems = {
        {"B", "The board"}, 
        {"G", "The memory game"},
        {"C", "The cards"},
        {"S", "The score"},
        {"H", "The how to play"},
        {"CM", "The Card Menu"},
        {"BM", "The Board Menu"},
        {"Q", "Quit Help"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private CardMenuControl cardMenuControl = new CardMenuControl();
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    private BoardMenuControl boardMenuControl = new BoardMenuControl();
    
    // default constructor
    public HelpMenuView() {
        
    } 

    public CardMenuControl getCardMenuControl() {
        return cardMenuControl;
    }

    public void setCardMenuControl(CardMenuControl cardMenuControl) {
        this.cardMenuControl = cardMenuControl;
    }

    public HelpMenuControl getHelpMenuControl() {
        return helpMenuControl;
    }

    public void setHelpMenuControl(HelpMenuControl helpMenuControl) {
        this.helpMenuControl = helpMenuControl;
    }

    public BoardMenuControl getBoardMenuControl() {
        return boardMenuControl;
    }

    public void setBoardMenuControl(BoardMenuControl boardMenuControl) {
        this.boardMenuControl = boardMenuControl;
    }
    
    // display the help menu and get the end users input selection
    public String getInput() {       
        
        String gameStatus = "PLAYING";
        do {
            this.display();
            
            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "B":
                    this.helpMenuControl.displayBoardHelp();
                    break;
                case "G":
                    this.helpMenuControl.displayGameHelp();
                    break;
                case "C":
                    this.helpMenuControl.displayCardHelp();
                    break;                  
                case "S":
                    this.helpMenuControl.displayScoreHelp();
                    break;
                case "H":
                    this.helpMenuControl.displayHowToPlayHelp();
                    break;
                case "CM":
                    cardMenuControl.displayCardMenu();
                    break;
                 case "BM":
                    boardMenuControl.displayBoardMenu();
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

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
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
        String[][] items = HelpMenuView.menuItems;

        for (String[] item : HelpMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
            
}
