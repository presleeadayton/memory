/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import java.util.Scanner;

public class Memory {
    
    //Instance variables
    String name;
    String instructions = "This is the game of Memory! \n\n"
            + "The player turns over two cards at a time\n" +
"trying to match all cards before the time runs out. If all cards are successfully matched\n" +
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
        gameCards.showCards();
        myGame.displayCardMenu(); //Preslee created displayCardMenu.
        images showImages = new images();
        showImages.cardImages();
        cards matchesLeft = new cards();
        matchesLeft.matchesLeft();
        score displayScore = new score();
        displayScore.displayScore();
        matches displayMatches = new matches();
        displayMatches.displaymatches();
        score tellScore = new score();
        tellScore.calculateScore();
        end finalScreen = new end();
        finalScreen.calculateFinalScore();
        myGame.displayHelp();
        myGame.displayBoardOptions();
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
}
