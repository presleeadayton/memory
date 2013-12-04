package memory.controls;

import memory.views.CardMenuView;
import memory.views.HelpMenuView;
import memory.views.BoardMenuView;
import java.io.Serializable;
import memory.Memory;
import memory.interfaces.MenuControl;

public class BoardMenuControl implements Serializable, MenuControl{
    
    public BoardMenuControl() {
        
    } 

    public void pauseGame() {
        System.out.println();
        this.displayCardBorder();             
        System.out.println( 
                "\tGame is Paused.");
        displayCardBorder();
    }

    public void restartGame() {
        System.out.println();
        displayCardBorder();     
        System.out.println( 
                 "\tGame is Restarted."); 
        displayCardBorder();
    }
            
    public void displayCardBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = Memory.getHelpMenu();
        helpMenu.getInput();
        
    }
    public void displayCardMenu() {
        CardMenuView cardMenu = Memory.getCardMenu();
        cardMenu.getInput();
        
    }
    public void displayBoardMenu() {
        BoardMenuView boardMenu = Memory.getBoardMenu();
        boardMenu.getInput();
    }
}