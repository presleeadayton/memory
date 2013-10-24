/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import java.util.Scanner;

public class PickedCardsView {
    
    public String getInput() {

        String pickedCard = null;
        Scanner in = new Scanner(System.in);
                
        boolean valid = false; // flag to indicate if valid character entered
        while (!valid) {
            // prompt for input
            System.out.println(
                    "Enter a set of characters to pick a card."
                    + " Example: A1 or 1A");
            
            // get input from user           
            pickedCard = in.nextLine();
           
            // no marker entered?
            if (pickedCard == null  || pickedCard.length() < 2 || pickedCard.length() > 2) {
                continue;
            }
            
            
            char firstCharacter=pickedCard.charAt(0);
            char secondCharacter=pickedCard.charAt(1);

            if(firstCharacter=='A' || firstCharacter=='a' || firstCharacter=='B' 
              || firstCharacter=='b' || firstCharacter=='C' || firstCharacter=='c' 
              || firstCharacter=='D' || firstCharacter=='d' || firstCharacter=='E' 
              || firstCharacter=='e' || firstCharacter=='F' || firstCharacter=='f'){ 
            
            if(secondCharacter=='1' || secondCharacter=='2' 
              || secondCharacter=='3' || secondCharacter=='4'){
               
            valid = true;
    }
}


            else if(firstCharacter=='1' || firstCharacter=='2' 
              || firstCharacter=='3' || firstCharacter=='4'){

            if(secondCharacter=='A' || secondCharacter=='a' 
              || secondCharacter=='B' || secondCharacter=='b' 
              || secondCharacter=='C' || secondCharacter=='c' 
              || secondCharacter=='D' || secondCharacter=='d' 
              || secondCharacter=='E' || secondCharacter=='e' 
              || secondCharacter=='F' || secondCharacter=='f'){
                
             valid = true;
    }
}
            else {
             
                new MemoryError().displayError(
                        "Incorrect character set entered. " +
                        "Choose a different character set.");
               continue; 
    }    
}
            
            if (pickedCard.equals("Q")) { // Quit?
                return null;
     }
        
        return pickedCard;
    }
}
