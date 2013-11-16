package memory;

import java.io.Serializable;

public class board implements Serializable {
    
    public board(){
    }
    public String getBoardColor() {
        return boardColor;
    }

    public void setBoardColor(String boardColor) {
        this.boardColor = boardColor;
    }
    public static String boardColor = "Our gameboard will be green.";
    public void displayboard() {
        //System.out.println(boardColor);
    }
}
