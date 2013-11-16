package memory;

import java.io.Serializable;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class PickedCardsView implements Serializable {
    
   public PickedCardsView(){
   }
    public cards getCards() {
        return cards;
    }

    public void setCards(cards cards) {
        this.cards = cards;
    }
    
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
                System.out.println(
                    "Enter two characters."
                    + " Example: A1 or 1A");
            
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
    
    private cards cards = new cards();
    public void cardsPicked(){
        long startTime = System.currentTimeMillis();
        String cardPicked;
        String alreadyMatched[] = new String[25];
        String tempValue[] = new String [2];
        int cardValue[] = new int [2];
            int cardSpotOne = 0;
            int counter = 0;
            int q = 0;
        while(!"aaa".equals(alreadyMatched[23])){
        cardPicked = getInput();
            tempValue[q] = cardPicked;
                q = q + 1;
            for (int y = 0; y < 24; y = y + 1){
                if(cardPicked.equals(alreadyMatched[y])){
               
               System.out.println("That Card was already chosen, try again.");
                    q = 0;
                        cardPicked = getInput();
                            tempValue[q] = cardPicked;
                                y = 0;
                                q = q + 1;
       }
  }
            
                int[] cardImages;

		cardImages = new int[12];
		cardImages[0] = 100;
		cardImages[1] = 200;
		cardImages[2] = 300;
		cardImages[3] = 400;
		cardImages[4] = 500;
		cardImages[5] = 600;
		cardImages[6] = 700;
		cardImages[7] = 800;
		cardImages[8] = 900;
		cardImages[9] = 1000;
		cardImages[10] = 1100;
		cardImages[11] = 1200;
                
                int x;
                int y = 0;
                if("a1".equals(cardPicked) || "A1".equals(cardPicked) || 
                   "1a".equals(cardPicked) || "1A".equals(cardPicked) ||
                   "b1".equals(cardPicked) || "B1".equals(cardPicked) || 
                   "1b".equals(cardPicked) || "1B".equals(cardPicked)){
                   x = 100;
                   
                   System.out.println(cardPicked + " is equal to " + x);
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
                 
                }   
                else if("c1".equals(cardPicked) || "C1".equals(cardPicked) || 
                   "1c".equals(cardPicked) || "1C".equals(cardPicked) ||
                   "d1".equals(cardPicked) || "D1".equals(cardPicked) || 
                   "1d".equals(cardPicked) || "1D".equals(cardPicked)){
                   x = 200;
                   
                   System.out.println(cardPicked + " is equal to " + x);
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
               
                }   
                else if("e1".equals(cardPicked) || "E1".equals(cardPicked) || 
                   "1e".equals(cardPicked) || "1E".equals(cardPicked) ||
                   "f1".equals(cardPicked) || "F1".equals(cardPicked) || 
                   "1f".equals(cardPicked) || "1F".equals(cardPicked)){
                   x = 300;
                   
                   System.out.println(cardPicked + " is equal to " + x);
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
             
                  }   
                 else if("c2".equals(cardPicked) || "C2".equals(cardPicked) || 
                   "2c".equals(cardPicked) || "2C".equals(cardPicked) ||
                   "d2".equals(cardPicked) || "D2".equals(cardPicked) || 
                   "2d".equals(cardPicked) || "2D".equals(cardPicked)){
                   x = 500;
                   
                   System.out.println(cardPicked + " is equal to " + x);
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
                
                } 
                else if("a3".equals(cardPicked) || "A3".equals(cardPicked) || 
                   "3a".equals(cardPicked) || "3A".equals(cardPicked) ||
                   "b3".equals(cardPicked) || "B3".equals(cardPicked) || 
                   "3b".equals(cardPicked) || "3B".equals(cardPicked)){
                   x = 700;
                   
                   System.out.println(cardPicked + " is equal to " + x);
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
            
                }   
                else if("c3".equals(cardPicked) || "C3".equals(cardPicked) || 
                   "3c".equals(cardPicked) || "3C".equals(cardPicked) ||
                   "d3".equals(cardPicked) || "D3".equals(cardPicked) || 
                   "3d".equals(cardPicked) || "3D".equals(cardPicked)){
                   x = 800;
                   
                   System.out.println(cardPicked + " is equal to " + x);
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
                   
                }   
                else if("e3".equals(cardPicked) || "E3".equals(cardPicked) || 
                   "3e".equals(cardPicked) || "3E".equals(cardPicked) ||
                   "f3".equals(cardPicked) || "F3".equals(cardPicked) || 
                   "3f".equals(cardPicked) || "3F".equals(cardPicked)){
                   x = 900;
                   
                   System.out.println(cardPicked + " is equal to " + x);
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;

                }   
                else if("a4".equals(cardPicked) || "A4".equals(cardPicked) || 
                   "4a".equals(cardPicked) || "4A".equals(cardPicked) ||
                   "b4".equals(cardPicked) || "B4".equals(cardPicked) || 
                   "4b".equals(cardPicked) || "4B".equals(cardPicked)){
                   x = 1000;
                   
                   System.out.println(cardPicked + " is equal to " + x);
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
  
                }   
                else if("c4".equals(cardPicked) || "C4".equals(cardPicked) || 
                   "4c".equals(cardPicked) || "4C".equals(cardPicked) ||
                   "d4".equals(cardPicked) || "D4".equals(cardPicked) || 
                   "4d".equals(cardPicked) || "4D".equals(cardPicked)){
                   x = 1100;
                   
                   System.out.println(cardPicked + " is equal to " + x);
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
                    
                }   
                else if("e4".equals(cardPicked) || "E4".equals(cardPicked) || 
                   "4e".equals(cardPicked) || "4E".equals(cardPicked) ||
                   "f4".equals(cardPicked) || "F4".equals(cardPicked) || 
                   "4f".equals(cardPicked) || "4F".equals(cardPicked)){
                   x = 1200;
                    
                   System.out.println(cardPicked + " is equal to " + x);
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
                   
          }
                if (cardValue[0] == cardValue[1]){
           
                    alreadyMatched[counter] = tempValue[0];
                        counter = counter + 1;
                            alreadyMatched[counter] = tempValue[1];
           
                            System.out.println("Congratulations! You've found a match!");
                               this.cards.showCards();
                                q = 0;
                                cardSpotOne = 0;
        }
                    else if(q == 2){
                        q = 0;
                        cardSpotOne = 0;
                            System.out.println("Sorry, those two don't match.");
                                this.cards.showCards();
        }
                         else{
           
        }
    }
                long endTime = System.currentTimeMillis();
                long elapsedTime = endTime - startTime; 
                System.out.println("The game is over. This is your time " + elapsedTime + ".");
}            
        private void storeInput(){
            int i;
            int j = 0;
            int k = 0;
            Scanner in = new Scanner(System.in);
            String tempInput = null;
                String board[][] = new String [2][2];

		for(i=1; i<3; i=i+1){
                    System.out.println("Please enter choice" + " " + String.valueOf(i)
                            + ".");
			tempInput = in.nextLine();
				board[j][k] = "choice " + String.valueOf(i);
				board[j][k + 1] = tempInput;
					j = j + 1;	
            }
                
	sortInput(board);		
     }
        
        private void sortInput(String[][] board){
            int i = 1;
            int j = 0;
               String str1 = board[0][1];
               String str2 = board[1][1];
               int result = str1.compareTo(str2);
               if(result == 0){
               }
               else if(result < 0){
                   board[1][1] = str1;
                   board[0][1] = str2;
               }
               else{    
               }
                    for(i=0; i<board.length; i=i+1){
			for(j=0; j<board.length; j=j+1){
			
				System.out.println(board[i][j]);	
                                   
            }
        }
    }
}