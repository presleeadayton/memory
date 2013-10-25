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
    public void cardsPicked(){
        String cardPicked;
        cardPicked = getInput();

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
                   
                   for (int i = 0; i < 12; i = i + 1) {
	
                        if(cardImages[i] == x){
                            System.out.println("You have picked a card!");
                                break;

                        }
                        else if(cardImages[i] != x){
                            y = y + 1;
                        }
                    }
                        if(y == 12){
                            System.out.println("This card has already been matched.");
                        }
                }   
                else if("c1".equals(cardPicked) || "C1".equals(cardPicked) || 
                   "1c".equals(cardPicked) || "1C".equals(cardPicked) ||
                   "d1".equals(cardPicked) || "D1".equals(cardPicked) || 
                   "1d".equals(cardPicked) || "1D".equals(cardPicked)){
                   x = 200;
                for (int i = 0; i < 12; i = i + 1) {
	
                        if(cardImages[i] == x){
                            System.out.println("You have picked a card!");
                                break;

                        }
                        else if(cardImages[i] != x){
                            y = y + 1;
                        }
                    }
                        if(y == 12){
                            System.out.println("This card has already been matched.");
                        }
                }   
                else if("e1".equals(cardPicked) || "E1".equals(cardPicked) || 
                   "1e".equals(cardPicked) || "1E".equals(cardPicked) ||
                   "f1".equals(cardPicked) || "F1".equals(cardPicked) || 
                   "1f".equals(cardPicked) || "1F".equals(cardPicked)){
                   x = 300;
                for (int i = 0; i < 12; i = i + 1) {
	
                        if(cardImages[i] == x){
                            System.out.println("You have picked a card!");
                                break;

                        }
                        else if(cardImages[i] != x){
                            y = y + 1;
                        }
                    }
                        if(y == 12){
                            System.out.println("This card has already been matched.");
                        }
                }   
                  else if("a2".equals(cardPicked) || "A2".equals(cardPicked) || 
                   "2a".equals(cardPicked) || "2A".equals(cardPicked) ||
                   "b2".equals(cardPicked) || "B2".equals(cardPicked) || 
                   "2b".equals(cardPicked) || "2B".equals(cardPicked)){
                   x = 400;
                for (int i = 0; i < 12; i = i + 1) {
	
                        if(cardImages[i] == x){
                            System.out.println("You have picked a card!");
                                break;

                        }
                        else if(cardImages[i] != x){
                            y = y + 1;
                        }
                    }
                        if(y == 12){
                            System.out.println("This card has already been matched.");
                        }
                }   
                 else if("c2".equals(cardPicked) || "C2".equals(cardPicked) || 
                   "2c".equals(cardPicked) || "2C".equals(cardPicked) ||
                   "d2".equals(cardPicked) || "D2".equals(cardPicked) || 
                   "2d".equals(cardPicked) || "2D".equals(cardPicked)){
                   x = 500;
                for (int i = 0; i < 12; i = i + 1) {
	
                        if(cardImages[i] == x){
                            System.out.println("You have picked a card!");
                                break;

                        }
                        else if(cardImages[i] != x){
                            y = y + 1;
                        }
                    }
                        if(y == 12){
                            System.out.println("This card has already been matched.");
                        }
                }   
                else if("e2".equals(cardPicked) || "E2".equals(cardPicked) || 
                   "2e".equals(cardPicked) || "2E".equals(cardPicked) ||
                   "f2".equals(cardPicked) || "F2".equals(cardPicked) || 
                   "2f".equals(cardPicked) || "2F".equals(cardPicked)){
                   x = 600;
                for (int i = 0; i < 12; i = i + 1) {
	
                        if(cardImages[i] == x){
                            System.out.println("You have picked a card!");
                                break;

                        }
                        else if(cardImages[i] != x){
                            y = y + 1;
                        }
                    }
                        if(y == 12){
                            System.out.println("This card has already been matched.");
                        }
                }   
                else if("a3".equals(cardPicked) || "A3".equals(cardPicked) || 
                   "3a".equals(cardPicked) || "3A".equals(cardPicked) ||
                   "b3".equals(cardPicked) || "B3".equals(cardPicked) || 
                   "3b".equals(cardPicked) || "3B".equals(cardPicked)){
                   x = 700;
                for (int i = 0; i < 12; i = i + 1) {
	
                        if(cardImages[i] == x){
                            System.out.println("You have picked a card!");
                                break;

                        }
                        else if(cardImages[i] != x){
                            y = y + 1;
                        }
                    }
                        if(y == 12){
                            System.out.println("This card has already been matched.");
                        }
                }   
                else if("c3".equals(cardPicked) || "C3".equals(cardPicked) || 
                   "3c".equals(cardPicked) || "3C".equals(cardPicked) ||
                   "d3".equals(cardPicked) || "D3".equals(cardPicked) || 
                   "3d".equals(cardPicked) || "3D".equals(cardPicked)){
                   x = 800;
                for (int i = 0; i < 12; i = i + 1) {
	
                        if(cardImages[i] == x){
                            System.out.println("You have picked a card!");
                                break;

                        }
                        else if(cardImages[i] != x){
                            y = y + 1;
                        }
                    }
                        if(y == 12){
                            System.out.println("This card has already been matched.");
                        }
                }   
                else if("e3".equals(cardPicked) || "E3".equals(cardPicked) || 
                   "3e".equals(cardPicked) || "3E".equals(cardPicked) ||
                   "f3".equals(cardPicked) || "F3".equals(cardPicked) || 
                   "3f".equals(cardPicked) || "3F".equals(cardPicked)){
                   x = 900;
                for (int i = 0; i < 12; i = i + 1) {
	
                        if(cardImages[i] == x){
                            System.out.println("You have picked a card!");
                                break;

                        }
                        else if(cardImages[i] != x){
                            y = y + 1;
                        }
                    }
                        if(y == 12){
                            System.out.println("This card has already been matched.");
                        }
                }   
                else if("a4".equals(cardPicked) || "A4".equals(cardPicked) || 
                   "4a".equals(cardPicked) || "4A".equals(cardPicked) ||
                   "b4".equals(cardPicked) || "B4".equals(cardPicked) || 
                   "4b".equals(cardPicked) || "4B".equals(cardPicked)){
                   x = 1000;
                for (int i = 0; i < 12; i = i + 1) {
	
                        if(cardImages[i] == x){
                            System.out.println("You have picked a card!");
                                break;

                        }
                        else if(cardImages[i] != x){
                            y = y + 1;
                        }
                    }
                        if(y == 12){
                            System.out.println("This card has already been matched.");
                        }
                }   
                else if("c4".equals(cardPicked) || "C4".equals(cardPicked) || 
                   "4c".equals(cardPicked) || "4C".equals(cardPicked) ||
                   "d4".equals(cardPicked) || "D4".equals(cardPicked) || 
                   "4d".equals(cardPicked) || "4D".equals(cardPicked)){
                   x = 1100;
                for (int i = 0; i < 12; i = i + 1) {
	
                        if(cardImages[i] == x){
                            System.out.println("You have picked a card!");
                                break;

                        }
                        else if(cardImages[i] != x){
                            y = y + 1;
                        }
                    }
                        if(y == 12){
                            System.out.println("This card has already been matched.");
                        }
                }   
                else if("e4".equals(cardPicked) || "E4".equals(cardPicked) || 
                   "4e".equals(cardPicked) || "4E".equals(cardPicked) ||
                   "f4".equals(cardPicked) || "F4".equals(cardPicked) || 
                   "4f".equals(cardPicked) || "4F".equals(cardPicked)){
                   x = 1200;
                for (int i = 0; i < 12; i = i + 1) {
	
                        if(cardImages[i] == x){
                            System.out.println("You have picked a card!");
                                break;

                        }
                        else if(cardImages[i] != x){
                            y = y + 1;
                        }
                    }
                        if(y == 12){
                            System.out.println("This card has already been matched.");
              }
          }   
    }
}