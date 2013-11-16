package memory;

import java.io.Serializable;


public class score implements Serializable {
    
    public score(){
    }
    public String getShowScore() {
        return showScore;
    }

    public void setShowScore(String showScore) {
        this.showScore = showScore;
    }
    public static String showScore = "This will display the score.";
    public void displayScore() {
         System.out.println(showScore);
    }
  
    public void averageTime() {
        
        int timeStored[] = {1, 2, 1, 4};

            int sum = 0;
            int average = 0;
            for(int i : timeStored){
                sum = sum + i;

            }
              average = sum / 2;

            System.out.println("Your average completion time is: " + average);

    }
}
