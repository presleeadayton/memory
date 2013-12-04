package memory.views;

import java.io.Serializable;
import java.util.Scanner;
import memory.controls.BoardMenuControl;
import memory.controls.CardMenuControl;
import memory.controls.HelpMenuControl;
import memory.Menu;
import memory.interfaces.EnterInfo;
import memory.enums.HelpMenuEnums;

public class HelpMenuView extends Menu implements Serializable, EnterInfo{
            
   
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
        super(HelpMenuView.menuItems);
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
    public void getInput() {       
        
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
                    gameStatus =  "QUIT";
            }
        } 
        while (!gameStatus.equals("QUIT"));  
        
    }
}