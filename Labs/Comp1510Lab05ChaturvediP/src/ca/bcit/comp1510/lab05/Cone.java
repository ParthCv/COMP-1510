/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 * Cone - calculates volume,slant height and surface area of a cone.
 * 
 * @author Chaturvedi,Parth
 * @version 16-02-2021
 */
public class Cone {
    
    /**
     * THREE - for the number three.
     */
    
    public static final int THREE = 3; 
    
    /**
     * radius - for the radius of the cone.
     */
    
    private double radius;
    
    /**
     * height - for the height of the cone.
     */
    
    private double height;
            
    Cone(double rad, double hght) {
        
        radius = rad;
        height = hght;
    }
    
    /**
     * getRadius() - returns the radius of the cone.  
     * @return radius
     */
    
    public double getRadius() {
        
        return radius;
    }
    
    /**
     * getHeight() - returns the height of the cone.
     * @return height
     */
    
    public double getHeight() {
        
        return height;
    }
    
    /**
     * setRadius() - sets the radius of the cone.
     * @param radi (radius)
     */
    
    public void setRadius(double radi) {
        
        radius = radi;
    }
    
    /**
     * setHeight() - sets the height of the cone.
     * @param heght (height)
     */
    
    public void setHeight(double heght) {
        
        height = heght;
    }
    
    /**
     * volume() - calculates the volume of cone and returns it.
     * @return vol (volume)
     */
    
    public double volume() {
        
        double vol = (Math.PI * Math.pow(radius, 2) * height) / THREE;
        return vol;
    }
    
    /**
     * slantHeight() - calculates the slant height of cone and returns it.
     * @return slHght (slant height)
     */
    
    public double slantHeight() {
        
        double slHght = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return slHght;
    }
    
    /**
     * surfaceArea() - calculates the surface are of the cone and returns it.
     * @return surfAr (surface area)
     */
    
    public double surfaceArea() {
        
        double surfAr = (Math.PI * Math.pow(radius, 2)) + (Math.PI * radius 
            + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
        return surfAr;
    }
    
    /**
     * toString() - returns the information of the cone.
     * @return height,radius
     */
    
    public String toSring() {
        
        String info;
        info = "Height of cone = " + height + " radius of the cone = " + radius;
        return info;        
    }
    
    

}
