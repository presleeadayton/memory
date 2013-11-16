package memory;

import java.io.Serializable;


public class CardMenuControl implements Serializable {

    public CardMenuControl() {
        
    } 

    public void displayCardImages() {
        System.out.println();
        this.displayCardBorder();             
        System.out.println( 
                "\tImages will be displayed on the cards.");
        displayCardBorder();
    }

    public void displayCardLetters() {
        System.out.println();
        displayCardBorder();     
        System.out.println( 
                 "\tLetters of the alphabet will be displayed on the cards."); 
        displayCardBorder();
    }
            
    public void displayCardNumbers() {
        System.out.println();
        displayCardBorder();     
        System.out.println( 
                "\tNumbers will be displayed on the cards."); 
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
