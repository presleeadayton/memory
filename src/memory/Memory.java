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
            + "Players take turns, one at a time.\n" +
"On each turn, a player turns over two cards (one at a time) and keeps them if they match.\n" +
"If they successfully match a pair of numbers, that player also gets to take another turn.\n" +
"Players continue taking turns until the last match is found.\n" +
"Each player then adds up the pairs/matches they got. Each pair is worth 1 point.\n" +
"The player with the most pairs/matches; WINS.";
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
}
