package memory;

import java.io.Serializable;

public class board extends SuperExamplePreslee implements Serializable {
    
    public board(){
    }
    
    @Override
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
