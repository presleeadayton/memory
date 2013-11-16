package memory;

//import javax.swing.JButton;

import java.io.Serializable;



public class start implements Serializable {
    
    public start(){
    }
    public String getStartButton() {
        return startButton;
    }

    public void setStartButton(String startButton) {
        this.startButton = startButton;
    }
    public static String startButton = "This will be the start button.";

public void startGame(){ 
    //JButton button2 = new JButton("Start");
    //System.out.println(startButton);
    }
}
