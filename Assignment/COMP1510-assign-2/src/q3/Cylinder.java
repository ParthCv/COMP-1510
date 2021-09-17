/**
 * 
 */

package q3;

/**
 * Cylinder - Calculates the surface area and volume of the cylinder.
 *
 * @author Chaturvedi,Parth
 * @version 1.0
 */

public class Cylinder {

    /**
     * radius- for the radius of cylinder. 
     */
    
    private double radius;
    
    /**
     *  height- for the height of the cylinder.
     */
    
    private double height;
    
    /**
     * Constructor for Cylinder class.
     * @param rad (radius)
     * @param hght (height)
     */
    
    Cylinder(double rad, double hght) {
        
        radius = rad;
        height = hght;
    }
    
    /**
     * getRadius- returns the radius of the cylinder. 
     * @return radius
     */
    
    public double getRadius() {
        
        return radius;
    }
    
    /**
     * getHeight- returns the height of the cylinder.
     * @return height
     */
    
    public double getHeight() {
        
        return height;
    }
    
    /**
     * setRadius- sets the radius of the cylinder.
     * @param setRad (radius)
     */
    
    public void setRadius(double setRad) {
        
        radius = setRad;
    }
    
    /**
     * setHeight- sets the height of the cylinder.
     * @param setHght (height)
     */
    
    public void setHeight(double setHght) {
        
        height = setHght;
    }
    
    /**
     * surfaceArea- calculates the surface area of the cylinder.
     * @return surface area
     */
    
    public double surfaceArea() {
        
        double surfAr;
        surfAr = 2 * Math.PI * radius * (radius + height);
        return surfAr;
    }
    
    /**
     * volume- calculates the volume of the cylinder.
     * @return volume
     */
    
    public double volume() {
        
        double vol;
        vol = Math.PI * Math.pow(radius, 2) * height;
        return vol;
    }
    
    /**
     * returns the height and radius of the cylinder.
     * @return height,radius
     */
    
    public String toString() {
        
        String info = "Height = " + height + "\nRadius = " + radius;
        return info;
    }
    
}
