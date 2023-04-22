package manipulators;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class GalagaManipulator extends ImageManipulator{
    public GalagaManipulator(){
        super("images/galaga.png");
    }
    
    @Override
    public BufferedImage transformImage(BufferedImage inputImage, Random random) {
        return super.transformImage(inputImage, random);
    }

    @Override
    public Color getColorAtPoint(int x, int y, float brightness, Random random) {
        
        if(super.getColorAtPoint(x,y,brightness,random).equals(new Color(41, 255, 57))){
            float seal = Math.max(0, brightness); 
            return new Color(seal,seal,seal);
        }else if (brightness!=0) {
            return super.getColorAtPoint(x,y,brightness,random); 
        }
        return new Color(255,255,255);
        
    }
}
