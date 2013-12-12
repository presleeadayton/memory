package memory.frames;

import memory.cards;

public class MainCommands {
    
    public void cardDisplay(){
    
    cards cardDisplay = new cards();
    cardDisplay.getCards();
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
}