/*
 * Preslee created CardMenuControl.java
 */
package memory;


public class CardMenuControl {
    
    public CardMenuControl() {
        
    } 

    public void displayCardImages() {
        System.out.println();
        this.displayCardBorder();             
        System.out.println( 
                "\tImages will be displayed on the cards.");
        displayCardBorder();
    }

    public void displayCardLetters() {
        System.out.println();
        displayCardBorder();     
        System.out.println( 
                 "\tLetters of the alphabet will be displayed on the cards."); 
        displayCardBorder();
    }
            
    public void displayCardNumbers() {
        System.out.println();
        displayCardBorder();     
        System.out.println( 
                "\tNumbers will be displayed on the cards."); 
        displayCardBorder();
    
    }
    public void displayCardBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
}
