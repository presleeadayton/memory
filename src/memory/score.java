/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;


public class score {
    String showScore = "This will display the score.";
    public void displayScore() {
         System.out.println(showScore);
    }
    public void calculateScore(){
        double firstNumber, secondNumber;
        int finalScore;
        String tellScore = null;
        firstNumber = 10.23;
        secondNumber = 5.16;
        finalScore = (int) (firstNumber + secondNumber/secondNumber);
        if (finalScore == 11){
            tellScore = "Congratulations! \n \t Your score is: " + finalScore;
        }
        System.out.println(tellScore);
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
