package memory.views;

import java.io.Serializable;
import java.util.Scanner;
import memory.BoardMenuControl;
import memory.CardMenuControl;
import memory.HelpMenuControl;
import memory.Menu;
import memory.enums.BoardMenuEnums;
import memory.interfaces.EnterInfo;

public class BoardMenuView extends Menu implements Serializable, EnterInfo{
    
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
    @Override
    // display the help menu and get the end users input selections
    public void getInput() {       
        
        String gameStatus = "PLAYING";
        do {
            this.display();
            
            String command = this.getCommand();
            // get commaned entered
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
                    gameStatus = "QUIT";
            }
        } 
        while (!gameStatus.equals("QUIT"));  
    
    }
}
    