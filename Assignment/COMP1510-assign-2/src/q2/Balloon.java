package q2;

/**
 * Balloon - calculates the volume of ballon with changing radius.
 *
 * @author Chaturvedi,Parth
 * @version 1.0
 */
public class Balloon {
      
    /**
     * THREE - for the number three.
     */
    
    public static final double THREE = 3;
    
    /**
     * FOUR - for the number four.
     */
    
    public static final double FOUR = 4;
    
    /**
     * radius - for the radius of the balloon.
     */
    
    private double radius;
    
    /**
     * inflate - to change the radius of the balloon.
     * @param amount - radius
     */
       
    public void inflate(double amount) {
        
        radius += amount;
    }
    
    /**
     * getVolume - calculates the volume of the balloon.
     * @return volume
     */
    
    public double getVolume() {
        
        double vol;
        vol = (FOUR * Math.pow(radius, THREE) * Math.PI) / THREE;
        return vol;
    }
    
}
