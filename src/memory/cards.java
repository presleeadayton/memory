/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;


public class cards {
    String cards = "These will be our cards used in the game.";
    public void showCards() {
         System.out.println(cards);
    }
    public void matchesLeft(){
        short alreadyMatched, totalNumber;
        int cardsLeft;
        String matches = null;
        alreadyMatched = 8;
        totalNumber = 3;
        cardsLeft = (int) (alreadyMatched + totalNumber/totalNumber);
        if (cardsLeft == 9){
            matches = "There are \n \t" + cardsLeft + " cards left.";
        }
        System.out.println(matches);
    }
}
