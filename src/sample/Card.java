//import stuff
package sample;

import javafx.scene.image.Image;

import java.util.Arrays;
//Card class
public class Card {
    //Image showImage variable.
    Image showImage;
    //attributes string array which stores attributes.
    private String[] attributes = new String[4];
    //Card constructor, with String a and Image si parameters.
    public Card(String a,Image si){
        //loop that runs 4 times, for the 4 attributes.
        for(int i = 0;i<4;i++){
            //sets each spot in attributes to the corresponding substring in String a.
            attributes[i] = a.substring(i,i+1);
        }
        //sets showImage variable to si.
        showImage = si;
    }
    //accessor which returns one specific attribute of the card, based on the parameter int i.
    public String getOneAttribute(int i){
       return attributes[i];
    }
    //accessor which returns the image of the card, showImage.
    public Image getShowImage() {
        return showImage;
    }
}