/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;


public class cards {
    String cards = " A1 | B1 | C1 | D1 | E1 | F1"
               + "\n A2 | B2 | C2 | D2 | E2 | F2"
               + "\n A3 | B3 | C3 | D3 | E3 | F3"
               + "\n A4 | B4 | C4 | D4 | E4 | F4";
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
        //System.out.println(matches);
    }
}
