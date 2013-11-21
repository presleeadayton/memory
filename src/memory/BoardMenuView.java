package memory;

import java.io.Serializable;
import java.util.Scanner;

public class BoardMenuView extends Menu implements Serializable{
    
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
        super(BoardMenuView.menuItems);
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
    @Override
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
}
    