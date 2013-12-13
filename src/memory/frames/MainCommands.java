package memory.frames;

import memory.cards;
import memory.views.PickedCardsView;

public class MainCommands {
    
    public String cardDisplay(){
    
    cards cardDisplay = new cards();
    String temp = cardDisplay.getCards();
    return temp;
    }
    public void MainMenu(){
    
     MainFrame mainScreen = new MainFrame();
     mainScreen.setVisible(true);
    } 
    
    public void HelpMenu(){
     
     HelpMenu mainScreen = new HelpMenu();
     mainScreen.setVisible(true);
    }
    
    public void displayGame(){
        
     GameBoard game = new GameBoard();
     game.setVisible(true);
    }
    
     public void quitGame(){
        
     QuitRestart game = new QuitRestart();
     game.setVisible(true);
    }
     
    public String cardsPicked(String choice1, String choice2){
        
     PickedCardsView cardPicked = new PickedCardsView();
     String Response = cardPicked.cardsPicked(choice1, choice2);
     return Response;
    } 
}