package memory;

import memory.supers.SuperExampleNathan;
import java.io.Serializable;


public class cards extends SuperExampleNathan implements Serializable {
    
    public cards(){
    }
    
    @Override
    public String getCards() {
        return cards;
    }

    public void setCards(String cards) {
        this.cards = cards;
    }
    public static String cards = " A1 | B1 | C1 | D1 | E1 | F1"
               + "\n A2 | B2 | C2 | D2 | E2 | F2"
               + "\n A3 | B3 | C3 | D3 | E3 | F3"
               + "\n A4 | B4 | C4 | D4 | E4 | F4";
    public void showCards() {
         System.out.println(cards);
    }
}
