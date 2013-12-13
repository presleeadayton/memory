package memory.views;

import java.io.Serializable;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import memory.MemoryError;
import memory.cards;
import memory.customExceptionClasses.MenuException;

public class PickedCardsView implements Serializable {
    
   public PickedCardsView(){
   }
    public cards getCards() {
        return cards;
    }

    public void setCards(cards cards) {
        this.cards = cards;
    }
    
    public String getInput(String choice1, String choice2) /*throws MenuException*/ {

        String pickedCard1 = null;
        String pickedCard2 = null; 
        
               
        boolean valid = false; // flag to indicate if valid character entered
        while (!valid) {
           
            // get input from user           
            pickedCard1 = choice1;
            pickedCard2 = choice2;
               
           
            // no marker entered?
            if (pickedCard1 == null  || pickedCard1.length() < 2 || pickedCard1.length() > 2) {
                
                continue;
            }
            
            if (pickedCard2 == null  || pickedCard2.length() < 2 || pickedCard2.length() > 2) {
                
                continue;
            }
            
            /*try{int choicelength = pickedCard.length();
                int randomnumber = 2;
                randomnumber = randomnumber/choicelength;
            
            }
            catch (ArithmeticException exc){throw new MenuException("Please enter a card set.");}*/
            
            char firstCharacter1=pickedCard1.charAt(0);
            char secondCharacter1=pickedCard1.charAt(1);
            
            char firstCharacter2=pickedCard2.charAt(0);
            char secondCharacter2=pickedCard2.charAt(1);
            
            /*try{if(firstCharacter=='A' || firstCharacter=='a' || firstCharacter=='B' 
              || firstCharacter=='b' || firstCharacter=='C' || firstCharacter=='c' 
              || firstCharacter=='D' || firstCharacter=='d' || firstCharacter=='E' 
              || firstCharacter=='e' || firstCharacter=='F' || firstCharacter=='f'){
            
            int numbercheck = secondCharacter/1;
                
            }else if(secondCharacter=='1' || secondCharacter=='2' 
              || secondCharacter=='3' || secondCharacter=='4'){
            
            int numbercheck = secondCharacter/1;
            
            }
            
            }
            catch(ArithmeticException exc){throw new MenuException("Please enter a valid set of cards.");}*/
            

            if(firstCharacter1=='A' || firstCharacter1=='a' || firstCharacter1=='B' 
              || firstCharacter1=='b' || firstCharacter1=='C' || firstCharacter1=='c' 
              || firstCharacter1=='D' || firstCharacter1=='d' || firstCharacter1=='E' 
              || firstCharacter1=='e' || firstCharacter1=='F' || firstCharacter1=='f'){ 
            
            if(secondCharacter1=='1' || secondCharacter1=='2' 
              || secondCharacter1=='3' || secondCharacter1=='4'){
                
                
            if(firstCharacter2=='A' || firstCharacter2=='a' || firstCharacter2=='B' 
              || firstCharacter2=='b' || firstCharacter2=='C' || firstCharacter2=='c' 
              || firstCharacter2=='D' || firstCharacter2=='d' || firstCharacter2=='E' 
              || firstCharacter2=='e' || firstCharacter2=='F' || firstCharacter2=='f'){ 
            
            if(secondCharacter2=='1' || secondCharacter2=='2' 
              || secondCharacter2=='3' || secondCharacter2=='4'){
                
                valid = true;
                
            }
            }        
    }
}

            else if(firstCharacter1=='1' || firstCharacter1=='2' 
              || firstCharacter1=='3' || firstCharacter1=='4'){

            if(secondCharacter1=='A' || secondCharacter1=='a' 
              || secondCharacter1=='B' || secondCharacter1=='b' 
              || secondCharacter1=='C' || secondCharacter1=='c' 
              || secondCharacter1=='D' || secondCharacter1=='d' 
              || secondCharacter1=='E' || secondCharacter1=='e' 
              || secondCharacter1=='F' || secondCharacter1=='f'){
                
            if(firstCharacter2=='1' || firstCharacter2=='2' 
              || firstCharacter2=='3' || firstCharacter2=='4'){

            if(secondCharacter2=='A' || secondCharacter2=='a' 
              || secondCharacter2=='B' || secondCharacter2=='b' 
              || secondCharacter2=='C' || secondCharacter2=='c' 
              || secondCharacter2=='D' || secondCharacter2=='d' 
              || secondCharacter2=='E' || secondCharacter2=='e' 
              || secondCharacter2=='F' || secondCharacter2=='f'){
                
                valid = true;
                
            }
            }
    }
}
            else {
             
                /*new MemoryError().displayError(
                        "Incorrect character set entered. " +
                        "Choose a different character set.");
               continue;*/ 
    }    
}    
                        return pickedCard1;
    }
    
    private cards cards = new cards();
    public String cardsPicked(String choice1, String choice2) /*throws MenuException*/ {
        long startTime = System.currentTimeMillis();
        String cardPicked;
        String alreadyMatched[] = new String[25];
        String tempValue[] = new String [2];
            int cardValue[] = new int [3];
            int cardSpotOne = 0;
            int counter = 0;
            int q = 0;
        while(!"aaa".equals(alreadyMatched[23])){
            
            if (choice1 == null  || choice1.length() < 2 || choice1.length() > 2) {
                
                continue;
            }
            
            if (choice2 == null  || choice2.length() < 2 || choice2.length() > 2) {
                
                continue;
            }
 
            char firstCharacter1=choice1.charAt(0);
            char secondCharacter1=choice1.charAt(1);
            
            char firstCharacter2=choice2.charAt(0);
            char secondCharacter2=choice2.charAt(1);
            
       

            if(firstCharacter1=='A' || firstCharacter1=='a' || firstCharacter1=='B' 
              || firstCharacter1=='b' || firstCharacter1=='C' || firstCharacter1=='c' 
              || firstCharacter1=='D' || firstCharacter1=='d' || firstCharacter1=='E' 
              || firstCharacter1=='e' || firstCharacter1=='F' || firstCharacter1=='f'){ 
            
            if(secondCharacter1=='1' || secondCharacter1=='2' 
              || secondCharacter1=='3' || secondCharacter1=='4'){
                
                
            if(firstCharacter2=='A' || firstCharacter2=='a' || firstCharacter2=='B' 
              || firstCharacter2=='b' || firstCharacter2=='C' || firstCharacter2=='c' 
              || firstCharacter2=='D' || firstCharacter2=='d' || firstCharacter2=='E' 
              || firstCharacter2=='e' || firstCharacter2=='F' || firstCharacter2=='f'){ 
            
            if(secondCharacter2=='1' || secondCharacter2=='2' 
              || secondCharacter2=='3' || secondCharacter2=='4'){
                
              
                
            }
            }        
    }
}

            else if(firstCharacter1=='1' || firstCharacter1=='2' 
              || firstCharacter1=='3' || firstCharacter1=='4'){

            if(secondCharacter1=='A' || secondCharacter1=='a' 
              || secondCharacter1=='B' || secondCharacter1=='b' 
              || secondCharacter1=='C' || secondCharacter1=='c' 
              || secondCharacter1=='D' || secondCharacter1=='d' 
              || secondCharacter1=='E' || secondCharacter1=='e' 
              || secondCharacter1=='F' || secondCharacter1=='f'){
                
            if(firstCharacter2=='1' || firstCharacter2=='2' 
              || firstCharacter2=='3' || firstCharacter2=='4'){

            if(secondCharacter2=='A' || secondCharacter2=='a' 
              || secondCharacter2=='B' || secondCharacter2=='b' 
              || secondCharacter2=='C' || secondCharacter2=='c' 
              || secondCharacter2=='D' || secondCharacter2=='d' 
              || secondCharacter2=='E' || secondCharacter2=='e' 
              || secondCharacter2=='F' || secondCharacter2=='f'){
                
               
                
            }
            }
    }
}else{
                String ErrorOne = ("Please enter a valid set.");
                return ErrorOne;
            }
            
            
            
            
        //cardPicked = getInput(choice1, choice2);
       
            tempValue[0] = choice1;
            tempValue[1] = choice2;
                q = q + 1;
            for (int y = 0; y < 24; y = y + 1){
                if(choice1.equals(alreadyMatched[y])||choice2.equals(alreadyMatched[y])){
               
               String Response = ("That card was already chosen, try again.");
                    q = 0;
                        //cardPicked = getInput(choice1, choice2);
                            //tempValue[q] = cardPicked;
                                y = 0;
                                q = q + 1;
                                return Response;
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
                if("a1".equals(choice1) || "A1".equals(choice1) || 
                   "1a".equals(choice1) || "1A".equals(choice1) ||
                   "b1".equals(choice1) || "B1".equals(choice1) || 
                   "1b".equals(choice1) || "1B".equals(choice1)){
                   x = 100;
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
                 
                }   
                else if("c1".equals(choice1) || "C1".equals(choice1) || 
                   "1c".equals(choice1) || "1C".equals(choice1) ||
                   "d1".equals(choice1) || "D1".equals(choice1) || 
                   "1d".equals(choice1) || "1D".equals(choice1)){
                   x = 200;
                   
                    cardValue[cardSpotOne] = x;
                    cardSpotOne = cardSpotOne + 1;
               
                }   
                else if("e1".equals(choice1) || "E1".equals(choice1) || 
                   "1e".equals(choice1) || "1E".equals(choice1) ||
                   "f1".equals(choice1) || "F1".equals(choice1) || 
                   "1f".equals(choice1) || "1F".equals(choice1)){
                   x = 300;
                 
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
             
                  }   
                 else if("c2".equals(choice1) || "C2".equals(choice1) || 
                   "2c".equals(choice1) || "2C".equals(choice1) ||
                   "d2".equals(choice1) || "D2".equals(choice1) || 
                   "2d".equals(choice1) || "2D".equals(choice1)){
                   x = 500;
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
                
                } 
                else if("a3".equals(choice1) || "A3".equals(choice1) || 
                   "3a".equals(choice1) || "3A".equals(choice1) ||
                   "b3".equals(choice1) || "B3".equals(choice1) || 
                   "3b".equals(choice1) || "3B".equals(choice1)){
                   x = 700;
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
            
                }   
                else if("c3".equals(choice1) || "C3".equals(choice1) || 
                   "3c".equals(choice1) || "3C".equals(choice1) ||
                   "d3".equals(choice1) || "D3".equals(choice1) || 
                   "3d".equals(choice1) || "3D".equals(choice1)){
                   x = 800;
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
                   
                }   
                else if("e3".equals(choice1) || "E3".equals(choice1) || 
                   "3e".equals(choice1) || "3E".equals(choice1) ||
                   "f3".equals(choice1) || "F3".equals(choice1) || 
                   "3f".equals(choice1) || "3F".equals(choice1)){
                   x = 900;
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;

                }   
                else if("a4".equals(choice1) || "A4".equals(choice1) || 
                   "4a".equals(choice1) || "4A".equals(choice1) ||
                   "b4".equals(choice1) || "B4".equals(choice1) || 
                   "4b".equals(choice1) || "4B".equals(choice1)){
                   x = 1000;
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
  
                }   
                else if("c4".equals(choice1) || "C4".equals(choice1) || 
                   "4c".equals(choice1) || "4C".equals(choice1) ||
                   "d4".equals(choice1) || "D4".equals(choice1) || 
                   "4d".equals(choice1) || "4D".equals(choice1)){
                   x = 1100;
                   
                  cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
                    
                }   
                else if("e4".equals(choice1) || "E4".equals(choice1) || 
                   "4e".equals(choice1) || "4E".equals(choice1) ||
                   "f4".equals(choice1) || "F4".equals(choice1) || 
                   "4f".equals(choice1) || "4F".equals(choice1)){
                   x = 1200;
                    
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
                   
          }
                
                if("a1".equals(choice2) || "A1".equals(choice2) || 
                   "1a".equals(choice2) || "1A".equals(choice2) ||
                   "b1".equals(choice2) || "B1".equals(choice2) || 
                   "1b".equals(choice2) || "1B".equals(choice2)){
                   x = 100;
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
                 
                }   
                else if("c1".equals(choice2) || "C1".equals(choice2) || 
                   "1c".equals(choice2) || "1C".equals(choice2) ||
                   "d1".equals(choice2) || "D1".equals(choice2) || 
                   "1d".equals(choice2) || "1D".equals(choice2)){
                   x = 200;
                   
                    cardValue[cardSpotOne] = x;
                    cardSpotOne = cardSpotOne + 1;
               
                }   
                else if("e1".equals(choice2) || "E1".equals(choice2) || 
                   "1e".equals(choice2) || "1E".equals(choice2) ||
                   "f1".equals(choice2) || "F1".equals(choice2) || 
                   "1f".equals(choice2) || "1F".equals(choice2)){
                   x = 300;
                 
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
             
                  }   
                 else if("c2".equals(choice2) || "C2".equals(choice2) || 
                   "2c".equals(choice2) || "2C".equals(choice2) ||
                   "d2".equals(choice2) || "D2".equals(choice2) || 
                   "2d".equals(choice2) || "2D".equals(choice2)){
                   x = 500;
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
                
                } 
                else if("a3".equals(choice2) || "A3".equals(choice2) || 
                   "3a".equals(choice2) || "3A".equals(choice2) ||
                   "b3".equals(choice2) || "B3".equals(choice2) || 
                   "3b".equals(choice2) || "3B".equals(choice2)){
                   x = 700;
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
            
                }   
                else if("c3".equals(choice2) || "C3".equals(choice2) || 
                   "3c".equals(choice2) || "3C".equals(choice2) ||
                   "d3".equals(choice2) || "D3".equals(choice2) || 
                   "3d".equals(choice2) || "3D".equals(choice2)){
                   x = 800;
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
                   
                }   
                else if("e3".equals(choice2) || "E3".equals(choice2) || 
                   "3e".equals(choice2) || "3E".equals(choice2) ||
                   "f3".equals(choice2) || "F3".equals(choice2) || 
                   "3f".equals(choice2) || "3F".equals(choice2)){
                   x = 900;
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;

                }   
                else if("a4".equals(choice2) || "A4".equals(choice2) || 
                   "4a".equals(choice2) || "4A".equals(choice2) ||
                   "b4".equals(choice2) || "B4".equals(choice2) || 
                   "4b".equals(choice2) || "4B".equals(choice2)){
                   x = 1000;
                   
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
  
                }   
                else if("c4".equals(choice2) || "C4".equals(choice2) || 
                   "4c".equals(choice2) || "4C".equals(choice2) ||
                   "d4".equals(choice2) || "D4".equals(choice2) || 
                   "4d".equals(choice2) || "4D".equals(choice2)){
                   x = 1100;
                   
                  cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
                    
                }   
                else if("e4".equals(choice2) || "E4".equals(choice2) || 
                   "4e".equals(choice2) || "4E".equals(choice2) ||
                   "f4".equals(choice2) || "F4".equals(choice2) || 
                   "4f".equals(choice2) || "4F".equals(choice2)){
                   x = 1200;
                    
                   cardValue[cardSpotOne] = x;
                   cardSpotOne = cardSpotOne + 1;
                   
          }
                
                
                if (cardValue[0] == cardValue[1]){
           
                    alreadyMatched[counter] = tempValue[0];
                        counter = counter + 1;
                            alreadyMatched[counter] = tempValue[1];
           
                            String Response = ("Congratulations! You've found a match!");
                                   /*this.cards.showCards();*/
                                q = 0;
                                cardSpotOne = 0;
                                return Response;
        }
                    else if(q == 2){
                        q = 0;
                        cardSpotOne = 0;
                            String Response = ("Sorry, those two don't match.");
                            return Response;    
                                /*this.cards.showCards();*/
        }
                         else{
           
        }
    }
                long endTime = System.currentTimeMillis();
                long elapsedTime = endTime - startTime; 
                String Response = ("The game is over. This is your time: " + elapsedTime);
                    return Response;
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