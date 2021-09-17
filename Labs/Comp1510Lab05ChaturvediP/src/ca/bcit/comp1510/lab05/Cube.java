/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 * Cube-Calculates surface area,volume,face diagonal and space diagonal of cube.
 * 
 * @author Chaturvedi,Parth
 * @version 15-02-2021
 */
public class Cube {
    
    /**
     * THREE - for the number three.
     */
    
    public static final int THREE = 3;
    
    /**
     * SIX - for the number six.
     */
    
    public static final int SIX = 6;
    
    /**
     * xcord - for x coordinate.
     */
    
    private double xcord;
    
    /**
     * ycord - for y coordinate.
     */
    
    private double ycord;
    
    /**
     * zcord - for z coordinate.
     */
    
    private double zcord;
    
    /**
     * edge - for the edge lenght.
     */
    
    private double edge;
    
    /**
     * Constructor for Cube class.
     * @param x (x coordinate)
     * @param y (y coordinate)
     * @param z (z coordinate)
     * @param ed (edge length)
     */
    
    Cube(double x, double y, double z, double ed) {
        
        xcord = x;
        ycord = y;
        zcord = z;
        edge = ed;
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
     * getEdge() - returns the edge length.
     * @return radius.
     */
    
    public double getEdge() {
        
        return edge;
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
     * setEdge() - sets the edge length.
     * @param eg (edge)
     */
    
    public void setEdge(double eg) {
        
        edge = eg;
    }
    
    /**
     * toString() - returns the information of the cube.
     * @return xcord,ycord,zcord,edge
     */
    
    public String toSrting() {
        
        String info = "X coordinate = " + xcord + " Y coordinate = " + ycord 
            + " Z coordinate = " + zcord + " Edge length = " + edge;
        return info;
    }
    
    /**
     * surfaceArea() - calculates the surface area of the cube.
     * @return sa (surface area)
     */
    
    public double surfaceArea() {
        
        double sa = SIX * Math.pow(edge, 2);        
        return sa;
    }
    
    /**
     * volume() - calculates the volume of the cube.
     * @return vol (volume)
     */
    
    public double volume() {
        
        double vol = Math.pow(edge, THREE);
        return vol;
    }
    
    /**
     * fDiagonal() - calculates the face diagonal.
     * @return fd (face diagonal)
     */
    
    public double fDiagonal() {
        
        double fd = Math.sqrt(2) * edge;
        return fd;
    }
    
    /**
     * sDiagonal() - calculates the space diagonal.
     * @return sd (space diagonal)
     */
    
    public double sDiagonal() {
        
        double sd = Math.sqrt(THREE) * edge;
        return sd;
    }

}
