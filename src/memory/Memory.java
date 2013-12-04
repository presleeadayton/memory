package memory;

import memory.views.CardMenuView;
import memory.views.PickedCardsView;
import memory.views.HelpMenuView;
import memory.views.BoardMenuView;
import java.io.Serializable;
import java.util.Scanner;

public class Memory implements Serializable {
    private static final HelpMenuView helpMenu = new HelpMenuView();
    private static final CardMenuView cardMenu = new CardMenuView();
    private static final BoardMenuView boardMenu = new BoardMenuView();
    
    //Instance variables
    public static String name;
    public static String instructions = "This is the game of Memory! \n\n"
            + "The player turns over two cards at a time\n" +
              "trying to match all cards before the time runs out. "
            + "If all cards are successfully matched\n" +
              "within the time limit, the player progresses to the next level.";
    public static void main(String[] args) {
        Memory myGame = new Memory();
        myGame.getName();
        myGame.displayInstructions();
        start game = new start();
        game.startGame();
        board discription = new board();
        discription.displayboard();
        cards gameCards = new cards();
        myGame.displayCardMenu(); //Preslee created displayCardMenu.
        gameCards.showCards();
        images showImages = new images();
        showImages.cardImages();
        PickedCardsView cards = new PickedCardsView();
        cards.cardsPicked();
        PickedCardsView sortArray = new PickedCardsView();
        score displayScore = new score();
        displayScore.displayScore();
        matches displayMatches = new matches();
        displayMatches.matchesMatched();
        score tellScore = new score();
        tellScore.averageTime();
        myGame.displayHelp();
        myGame.displayBoardOptions(); 
    }
    public static HelpMenuView getHelpMenu(){
        return Memory.helpMenu;
    }
    public static CardMenuView getCardMenu(){
        return Memory.cardMenu;
    }
    public static BoardMenuView getBoardMenu(){
        return Memory.boardMenu;
    }
    public void getName(){ 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    public void displayInstructions(){
         System.out.println("\nWelcome " + this.name + "\n");
         System.out.println(this.instructions);
         
    }
    public void displayHelp(){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to view the help menu? \n Y / N");
        this.name = input.next();
        if ("Y".equals(this.name)){
            HelpMenuView HelpMenu = new HelpMenuView();
        HelpMenu.getInput();
        }  
    }
    
    //Preslee created displayCardMenu.
    public void displayCardMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to view the card menu? \n Y / N");
        this.name = input.next();
        if ("Y".equals(this.name)){
            CardMenuView CardMenu = new CardMenuView();
        CardMenu.getInput();
        }
    }
     //Nathan created displayBoardOptions.
    public void displayBoardOptions(){
        Scanner input = new Scanner(System.in);
        System.out.println("View Board Menu? \n Y / N");
        this.name = input.next();
        if ("Y".equals(this.name)){
            BoardMenuView BoardMenu = new BoardMenuView();
        BoardMenu.getInput();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
