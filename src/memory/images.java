package memory;

import java.io.Serializable;


public class images implements Serializable {
    
    public images(){
    }
    public String getShowImages() {
        return showImages;
    }

    public void setShowImages(String showImages) {
        this.showImages = showImages;
    }
    public static String showImages = "These will be the images on our game cards.";
    public void cardImages() {
         //System.out.println(showImages);
    }
}
