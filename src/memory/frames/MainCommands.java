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
}