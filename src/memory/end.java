/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

public class end {
    //String endScreen = "This shows scores and gives option to quit game or restart.";
    //public void finalScreen() {
        // System.out.println(endScreen);
    //}
    
    public void calculateFinalScore(){
        double firstNumber, secondNumber, thirdNumber, fourthNumber;
        int finalScore, finalScoreTwo;
        String tellScore = null;
        String tellScoreTwo = null;
        firstNumber = 10.23;
        secondNumber = 5.16;
        thirdNumber = 22.54;
        fourthNumber = 45.16;
        finalScore = (int) (firstNumber + secondNumber/secondNumber);
        finalScoreTwo = (int) (thirdNumber + fourthNumber/fourthNumber);
        if (finalScore == 11){
            tellScore = "Congratulations player one! \n \t Your score is: " + finalScore;
        }
        //System.out.println(tellScore);
        
        if (finalScoreTwo == 23){
            tellScoreTwo = "Congratulations player two! \n \t Your score is: " + finalScoreTwo;
        }
        //System.out.println(tellScoreTwo);
    }
    
}
