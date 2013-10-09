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
}
