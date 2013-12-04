package memory.controls;

import memory.views.CardMenuView;
import memory.views.HelpMenuView;
import memory.views.BoardMenuView;
import java.io.Serializable;
import memory.Memory;


public class HelpMenuControl implements Serializable {
    
    public HelpMenuControl() {
        
    } 

    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Memory consists of 10 rows and 10 columns "
                + "\n\t with cards laid out.");
        displayHelpBorder();
    }

    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe objective of the game is to find as many matches as possible "
                + "\n\t as quickly as possible by selecting two cards at a time to match."); 
        displayHelpBorder();
    }
            
    public void displayCardHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tMatch the image of one card with the image on another."); 
        displayHelpBorder();
    }
    
                   
    public void displayScoreHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tIf you can match all cards before the time runs out, you"
                + "\n\t progress to the next level."); 
        displayHelpBorder();
    }
             
    public void displayHowToPlayHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tContinue picking two cards until all cards are matched within"
                + "\n\t the time limit."); 
        displayHelpBorder();
    }
    
    public void displayHelpBorder() {       
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
