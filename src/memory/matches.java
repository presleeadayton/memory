package memory;

import java.io.Serializable;


public class matches implements Serializable {
    
    public matches(){
    }
    public String getShowMatches() {
        return showMatches;
    }

    public void setShowMatches(String showMatches) {
        this.showMatches = showMatches;
    }
    
    String showMatches = "This will keep track of cards that have been matched.";
    public void displaymatches() {
         System.out.println(showMatches);
    }
    
    public void matchesMatched(){
        String inputValue = "D4";
        String matches[] = new String[2];
        matches[0] = "a1";
	matches[1] = "D4";

        int i = 0;
		for(String x : matches){
			i=i+1;
			if(x.equals(inputValue)){
                            System.out.println("That card has already been matched.");
                                break;

            }
		else{
        }
				
    } 
		i=i/2;
		System.out.println("There are " + i + " matches."); 

    }
}
