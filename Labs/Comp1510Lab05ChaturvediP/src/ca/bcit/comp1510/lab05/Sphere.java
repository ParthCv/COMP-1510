/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 * Sphere - calculates the surface area and volume.
 * 
 * @author Chaturvedi,Parth
 * @version 15-02-2021
 */

public class Sphere {
    
    /**
     * THREE - for the number three.
     */
    
    public static final int THREE = 3;
    
    /**
     * FOUR - for the number four.
     */
    
    public static final int FOUR = 4; 
    
    /**
     * xcord - x-coordinate of sphere.
     */
    
    private double xcord;
    
    /**
     * ycord - y coordinate of sphere.
     */
    
    private double ycord;
    
    /**
     * zcord - z coordinate of sphere.
     */
    
    private double zcord;
    
    /**
     * radius - radius of the sphere.
     */
    
    private double radius;
    
    /**
     * Constructor for Sphere class.
     * @param x (x coordinate)
     * @param y (y coordinate)
     * @param z (z coordinate)
     * @param r (radius)
     */
    
    Sphere(double x, double y, double z, double r) {
        
        xcord = x;
        ycord = y;
        zcord = z;
        radius = r;
    }
    
    /**
     * getXcord() - returns the x coordinate.
     * @return xcord
     */
    
    public double getXcord() {
        
        return xcord;
    }
    
    /**
     * getYcord() - returns the y coordinate.
     * @return ycord
     */
    
    public double getYcord() {
        
        return ycord;
    }
    
    /**
     * getZcor()  - returns the z coordinate.
     * @return zcord
     */
    
    public double getZcord() {
        
        return zcord;
    }
    
    /**
     * getRadius() - returns the radius.
     * @return radius.
     */
    
    public double getRadius() {
        
        return radius;
    }
    
    /**
     * setXcord() - sets the x coordinate.
     * @param x (xcord)
     */
    
    public void setXcord(double x) {
        
        xcord = x;
    }
    
    /**
     * setYcord() - sets the y coordinate.
     * @param y (ycord)
     */
    
    public void setYcord(double y) {
        
        ycord = y;
    }
    
    /**
     * setZcord() - sets the z coordinate.
     * @param z (zcord)
     */
    
    public void setZcord(double z) {
        
        zcord = z;
    }
    
    /**
     * setRadius() - sets the radius of the sphere.
     * @param rad (radius)
     */
    
    public void setRadius(double rad) {
        
        radius = rad;
    }
    
    /**
     * surfaceArea() - calculate the surface area.
     * @return sa (surface area)
     */
    
    public double surfaceArea() {
        
        double sa = FOUR * Math.PI * Math.pow(radius, 2);
        return sa;
    }
    
    /**
     * volume() - calculate the volume.
     * @return vol (volume)
     */
    
    public double volume() {
        
        double vol = (FOUR * Math.PI * Math.pow(radius, THREE)) / THREE;
        return vol;
    }
    
    /**
     * toSrting() - returns the information of the object.
     * @return xcord,ycord,zcord,radius
     */
    
    public String toString() {
        
        String info = "X-coordinate = " + xcord + " Y-coordinate = " + ycord 
            + " Z-coordinate = " + zcord + " Radius = " + radius;
        return info;
    }

}
