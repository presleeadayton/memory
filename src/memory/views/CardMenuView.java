package memory.views;

import java.io.Serializable;
import java.util.Scanner;
import memory.BoardMenuControl;
import memory.CardMenuControl;
import memory.HelpMenuControl;
import memory.Menu;
import memory.interfaces.EnterInfo;

public class CardMenuView extends Menu implements Serializable, EnterInfo {
    
    /* We tried nesting right here but it broke the code on lines 44, 47, and 50. 
     * private class CardMenuControl {
    }*/
    private final static String[][] menuItems = {
        {"I", "Images"}, 
        {"L", "Letters"},
        {"N", "Numbers"},
        {"B", "Board Menu"},
        {"H", "Help Menu"},
        {"Q", "Quit Menu"}        
    };
    
    
    // Create instance of the HelpMenuControl (action) class
    private CardMenuControl cardMenuControl = new CardMenuControl();
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    private BoardMenuControl boardMenuControl = new BoardMenuControl();
    // default constructor
    public CardMenuView() {
        super(CardMenuView.menuItems);
    } 
    
    // display the help menu and get the end users input selection
    @Override
    public void getInput() {       
        
      String gameStatus = "PLAYING";
        do {
            this.display();
            
            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "I":
                    this.cardMenuControl.displayCardImages();
                    break;
                case "L":
                    this.cardMenuControl.displayCardLetters();
                    break;
                case "N":
                    this.cardMenuControl.displayCardNumbers();
                    break; 
                case "B":
                    boardMenuControl.displayBoardMenu();
                    break;
                case "H":
                    helpMenuControl.displayHelpMenu();
                    break;
                case "Q": 
                    gameStatus =  "QUIT";
            }
        } 
        while (!gameStatus.equals("QUIT"));  
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
            
}
